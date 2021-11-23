package Que9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("/Que9/Que9.xml");
			((AbstractApplicationContext)context).registerShutdownHook();
			Restaurant res=(Restaurant)context.getBean("restaurantBean");
		//System.out.println(res);
		res.greetCustomer();
		}

	
}
