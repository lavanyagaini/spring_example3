package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appconst=new AnnotationConfigApplicationContext(Config.class);
		Mobile mb=appconst.getBean("mobile",Mobile.class);
		
		mb.used();
	}

}
