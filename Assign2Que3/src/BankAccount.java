import java.io.*;
import java.util.*;
public class BankAccount {
public static void main(String[] args) {
		int a1,a2,TotalAmount;
		BankAccount b1=new SavingAccount();
		BankAccount b2= new CurrentAccount();
		a1=((SavingAccount) b1).amount();
	    a2=((CurrentAccount) b2).amount();
		TotalAmount=a1+a2;
		System.out.println("Total amount in the bank is Rs."+TotalAmount);
	}

}
