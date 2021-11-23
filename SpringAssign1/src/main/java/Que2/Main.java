package Que2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

		public static void main(String[] args) {
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/Que2/Que2.xml");
			Question  q=(Question)context.getBean("Question");
			System.out.println(q);
			Question  q1=(Question)context.getBean("Question1");
			System.out.println(q1);
			Question  q2=(Question)context.getBean("Question2");
			System.out.println(q2);
			
		}

	
}
