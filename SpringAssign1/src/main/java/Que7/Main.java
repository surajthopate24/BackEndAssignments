package Que7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("/Que7/Que7.xml");
			Demo d1=	context.getBean("demo",Demo.class);
			System.out.println(d1);
		}

	
}
