package Que2;

public class StringBufferDemo {
public static void main(String[] args) {
StringBuffer sb1 = new StringBuffer();
sb1.append("StringBuffer ");
sb1.append("is a peer class of String");
sb1.append(" that provides much of"+" ");
sb1.append("the functionality of strings");
System.out.println(sb1);
StringBuffer sb2 = new StringBuffer("it is used to at the specified index position");
sb2.insert(13, " insert text");
System.out.println(sb2);
StringBuffer sb3 = new StringBuffer("This method returns the reversed object on which it was called");
sb3.reverse();
System.out.println(sb3);

}
}
