package JavaAssign7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class StringProgram {
	
		public static void main(String[] args) 
		{
			StringBuilder sb=new StringBuilder();
			Consumer<String> letter=(s)->
			{
				sb.append(s.charAt(0)); 
			};
			List<String> li=new ArrayList<>();
			li.add("Suraj");
			li.add("Pratik");
			li.add("Rohan");
			li.add("Avdhut");
			for (Iterator iterator = li.iterator(); iterator.hasNext();) 
			{
				String string = (String) iterator.next();
				letter.accept(string);
				
			}
	        System.out.println("-----");
			System.out.println(sb);
			System.out.println("-----");
		}
	}


