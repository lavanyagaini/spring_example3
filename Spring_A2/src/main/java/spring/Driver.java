package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		
		ApplicationContext appcon=new ClassPathXmlApplicationContext("item.xml");
		//if your class name is Item reference variable is item
		//reference variable must be lowercase of class name
		item i1 =(item) appcon.getBean("item",item.class);
		i1.used();
		
	}

}
