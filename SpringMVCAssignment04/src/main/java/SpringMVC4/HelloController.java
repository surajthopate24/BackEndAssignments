package SpringMVC4;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {

		@RequestMapping("/hello")
		public String display(HttpServletRequest req,Model m)
		{
			//read the provided form data
			String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			String email=req.getParameter("email");
			
			if(name.equals("Suraj")&& email.equals("surajthopate@gmail.com") && pass.equals("suraj"))
			{
				String msg="Hello "+ name;
				//add a message to the model
				m.addAttribute("message", msg);
				return "viewpage";
			}
			else
			{
				String msg="Sorry you entered wrong credentials";
				m.addAttribute("message", msg);
				return "errorpage";
			}	
		}
	

}
