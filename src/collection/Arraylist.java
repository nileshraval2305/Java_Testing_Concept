package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("nilesh");
		ar.add("Jenil");
		ar.add("preksha");
		
		for(String a : ar)
		{
			System.out.println(a);
		}
	
		// convert Array to Array List
		
		String student[] = {"siya","Jenil","kruti"};
		
		 List<String> star = Arrays.asList(student);
		 
		 for(String name:star)
		 {
		 
		 System.out.println(name);
		 }
		
	  String s = "Raval Nilesh K";
	  
	String abc[] =  s.split("Nilesh");
	  
	  System.out.println(abc[0]);
	  System.out.println(abc[1]);
	}

}
