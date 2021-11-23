import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args)
{
int num=0,orgNum=0,sum=0,digit=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Number:");
orgNum=scan.nextInt();
num=orgNum;
while(num!=0) {
	digit=num%10;
	sum=sum+(digit*digit*digit);
	num=num/10;
}
if(orgNum==sum) {
	System.out.println("Given Number is a ArmStrong Number");
}
else {
	System.out.println("Given Number is not a ArmStrong Number");
}



}
}
