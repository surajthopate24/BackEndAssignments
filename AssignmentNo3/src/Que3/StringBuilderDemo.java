package Que3;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("StringBuilder");
		sb1.append(" is a peer class of String");
		sb1.append(" that provides much of");
		sb1.append(" the functionality of strings");
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("it is used to at the specified index position");
		sb2.insert(13, " insert text");
		System.out.println(sb2);
		StringBuilder sb3 = new StringBuilder("This method returns the reversed object on which it was called");
		sb3.reverse();
		System.out.println(sb3);

	}

}
