package stream_New_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<String> words = Arrays.asList("hanky","PC",null ,"table","Laptop","keyboard");
	  
		List<String> longname = new ArrayList<String>(); // it is blank Arraylist
		
		
		//without using stream concept 
		
		
		// print even number using Stream 
		
	   // print even number and Stored in another collection using Stream
	
		words.stream().filter(w->w!=null).forEach(w->System.out.println(w));
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	}


