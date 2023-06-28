package spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Autowired
	@Qualifier("cow")
	private Animal animal;
	
	public void ZooAnimal() {
		animal.sound();
	}
}
