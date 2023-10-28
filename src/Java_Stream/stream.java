package Java_Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("nilesh");
		a1.add("niyati");
		a1.add("Preksha");
		a1.add("Jenil");
		a1.add("Khushi");
       String s ="Jenil";
      // System.out.println(s.length());
		
		long person = a1.stream().filter(name->name.startsWith("n")).count();
		
		//System.out.println(person);
		
		Stream.of("nilesh","niyati","Preksha","Jenil","Khushi").filter(name->name.startsWith("n")).count();
	
		Stream.of("nilesh","niyati","Preksha","Jenil","Khushi").filter(name->name.length()>5).forEach(name->System.out.println(name));
	
	}

}
