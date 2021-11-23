package Que1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 public static void main( String[] args )
	    {
	    
	    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/Que1/Que1.xml");
		Address ad=(Address)context.getBean("Address");
		System.out.println(ad);
		Customer sc=(Customer)context.getBean("Customer");
		System.out.println(sc);
		
	  } 
	
}
