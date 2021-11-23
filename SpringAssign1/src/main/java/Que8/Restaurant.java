package Que8;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;
public class Restaurant {

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

	
}
