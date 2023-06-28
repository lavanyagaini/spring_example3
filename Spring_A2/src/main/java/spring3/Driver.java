package spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appconst=new AnnotationConfigApplicationContext(Config.class);
		Elephant ele=appconst.getBean("elephant",Elephant.class);
		System.out.println(ele);
	}

}
