import java.util.*;
public class Result {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int i=0,j=0,temp;
int a[]=new int[3];
System.out.println("Enter the marks of three subjects: ");
for(i=0;i<3;i++)
{
a[i]=scan.nextInt();
}
for(i=0;i<3;i++)
{
for(j=i+1;j<3;j++)
{
if(a[i] < a[j])
{
temp=a[i];
a[i]=a[j];					
a[j]=temp;				
}			
}		
}		
result(a);	
}
static void result(int [] x)
{
if(x[0] > 60)		
{			
if(x[1] > 60)			
{				
if(x[2] > 60)				
{					
System.out.println("Congragulations You are Passed");				
}				
else				
{					
System.out.println("You are Promoted");				
}	
			
}
			
else
			
{
				
System.out.println("You are Failed");
			
}
		
}

else
		
{
			
System.out.println("You are Failed");
		
}
	
}
}
