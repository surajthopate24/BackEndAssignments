package Que1;
public class StringClassDemo {
public static void main(String[] args) 
{
String str ="Hello World";
int l=str.length();
System.out.println(l);//length of string is obtained.
String str1="Hello";
String str2=" How are you?";
//String str3= str1+str2;
String str3=str1.concat(str2);//Concatination of string is done.
System.out.println(str3);
String str4 = "Java String pool refers to collection of Strings which are stored in heap memory";
System.out.println(str4.toLowerCase());
System.out.println(str4.toUpperCase());
System.out.println(str4.replace("a", "$"));
String str5 = "java string pool refers to collection of strings which are stored in heap memory";
System.out.println(str4.equals(str5));//False
System.out.println(str4==str5);//False
System.out.println(str4.compareTo(str5));//returns number diffrence between two strings
System.out.println(str4.equalsIgnoreCase(str5));//true
}
}

