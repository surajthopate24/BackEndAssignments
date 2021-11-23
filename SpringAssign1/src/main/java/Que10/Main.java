package Que10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
		 public static void main(String[] args) 
		 {
		ApplicationContext context = new ClassPathXmlApplicationContext("/Que10/Que10.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle");
		triangle.draw();
		 }
		

}
