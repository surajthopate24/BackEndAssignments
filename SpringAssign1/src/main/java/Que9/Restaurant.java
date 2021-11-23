package Que9;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;
public class Restaurant {  //implements InitializingBean ,DisposableBean
		public String greetCustomer()
		{
			return "Welcome to NomaniRestaurant";
		}
		@PostConstruct
		public void init()
		{
			System.out.println("Restaurant bean is going through init");
		}
		@PreDestroy
		public void destroy()
		{
			System.out.println("Bean will destroy now you can see...");
		}
		
//		public void afterPropertiesSet() throws Exception {
//			// TODO Auto-generated method stub
//			System.out.println("Restaurant bean is going through After property set");
//	      }	
	//public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Restaurant bean is destroying now");
	//	
	//}
	
}
