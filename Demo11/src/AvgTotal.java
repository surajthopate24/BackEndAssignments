import java.util.Scanner;
public class AvgTotal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c,total;
		double avg=0.0;
		System.out.println("Enter the marks of A subject out of 100: ");
		a=scan.nextInt();		
		System.out.println("Enter the marks of B subject out of 100: ");		
		b=scan.nextInt();		
		System.out.println("Enter the marks of C subject out of 100: ");		
		c=scan.nextInt();		
		total=a+b+c;		
		avg=(total/3);		
		System.out.println("Total marks scored is "+total+" and average is "+avg);
	}

}
