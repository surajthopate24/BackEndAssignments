import java.util.Scanner;
public class ValidateLogin {
	static void validation(String name,String password,int attempts)
	{
	String n="Suraj",p="123";
	int result;
	if(attempts!=3)
	{
	if(name.equals(n) && password.equals(p))
    {
	System.out.println("Welcome " + name);
	}
	else
	{				
		System.out.println("Invalid Login");				
		attempts=attempts+1;				
		enterDetails(attempts);				
		if(attempts==3)				
		{					
		System.out.println("Login limit exceeded....!!!");				
		}			
		}		
		}	
		}	
		static void enterDetails(int attempts)	
		{	
		Scanner scan=new Scanner(System.in);		
		String password,name;		
		System.out.println("Enter the username:");		
		name=scan.next();		
		System.out.println("Enter password:");		
		password=scan.next();				
		validation(name,password,attempts);	
		}	
		public static void main(String[] args) 	
		{		
		int attempts=1;		
		enterDetails(attempts);
			
}
}
