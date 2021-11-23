import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[15];		
		int i,value;		
		boolean found=false;		
		System.out.println("Enter 15 elements in the array: ");		
		for(i=0;i<15;i++)		
		{			
		a[i]=scan.nextInt();		
		}		
		System.out.println("Enter the element to be searched: ");		
		value=scan.nextInt();		
		for(i=0;i<15;i++)		
		{			
		if(a[i]==value)			
		{				
		found=true;				
		System.out.println("Element " + value + " found in the array");				
		break;			
		}		
		}		
		if(found==false)	
		{			
		System.out.println("Element " + value + " is not found in the array");
	}
	}
}


