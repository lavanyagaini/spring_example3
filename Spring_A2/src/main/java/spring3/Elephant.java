package spring3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Elephant {

	@Value("1")
	private int id;
	@Value("ram")
	private String name;
	@Value("4")
	private int noOfLegs;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	@Override
	public String toString() {
		return "Elephant [id=" + id + ", name=" + name + ", noOfLegs=" + noOfLegs + "]";
	}
	
	
}
