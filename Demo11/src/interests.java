import java.io.*;
import java.util.*;
import java.lang.Math;
public class interests {
static double simpleInterest(double p,double t,double r)
{
double simpleInt;
simpleInt=(p*t*r)/100;
return simpleInt;
}
static double compoundInterest(double p,double t,double r,double n ) 
{
double compound;
compound = p * Math.pow(1 + (r / n), n * t);
double cinterest = compound - p;
return cinterest;
	
}
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);		
double p,t,r,n;
double s,c;
System.out.println("Enter Principal Amount: ");
p=scan.nextFloat();
System.out.println("Enter Time in years: ");
t=scan.nextFloat();
System.out.println("Enter Rate of interest: ");
r=scan.nextFloat();
System.out.println("Enter the number of times that interest is compounded");
n=scan.nextFloat();
s=simpleInterest(p,t,r);
c=compoundInterest(p,t,r,n);
System.out.println("Simple Interest is "+ s + " and Compound Interest is " + c);
}
}
