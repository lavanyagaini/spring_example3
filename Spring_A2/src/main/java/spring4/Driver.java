package spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String args[]) {
		ApplicationContext appcon=new AnnotationConfigApplicationContext(config.class);
		Charger charger=appcon.getBean("charger",Charger.class);
		System.out.println(charger);
		Laptop laptop=appcon.getBean("laptop",Laptop.class);
		System.out.println(laptop);
	}
}
