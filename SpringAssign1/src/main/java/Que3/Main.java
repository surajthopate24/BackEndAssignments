package Que3;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
		public static void main(String[] args) {
			
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/Que3/Que3.xml");
			BankAccount  bac=(BankAccount)context.getBean("BankAccount");
			System.out.println(bac);
			BankAccount  bac1=(BankAccount)context.getBean("BankAccount1");
			System.out.println(bac1);
			
		}

	
}
