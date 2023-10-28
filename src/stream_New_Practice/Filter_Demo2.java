package stream_New_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<String> names = Arrays.asList("nilesh","Jenil","Cara","Alay","Preksha");
	  
		List<String> longname = new ArrayList<String>(); // it is blank Arraylist
		
		
		//without using stream concept 
		
		
		// print even number using Stream 
		
	   // print even number and Stored in another collection using Stream
	
		longname = names.stream().filter(s->s.length()>4).collect(Collectors.toList());
	   System.out.println(longname);
	
	   names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	}


