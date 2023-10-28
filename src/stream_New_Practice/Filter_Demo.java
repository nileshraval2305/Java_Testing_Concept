package stream_New_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> numberlist = new ArrayList<Integer>();
		
		numberlist.add(10);
		numberlist.add(15);
		numberlist.add(20);
		numberlist.add(25);
		numberlist.add(30);
		numberlist.add(35);
		
		List<Integer> addnumber = Arrays.asList(10,15,20,25,30,35);
	  
		List<Integer> evennumber= new ArrayList<Integer>(); // it is blank Arraylist
		
		
		//without using stream concept 
		
		for(int n :addnumber)
		{
			
			if(n%2==0)
			{
			
				evennumber.add(n);
			}
			
		}
		
	   System.out.println("Print even number without using stream " +evennumber);
	
		// print even number using Stream 
		
	   // print even number and Stored in another collection using Stream
	
	   evennumber = addnumber.stream().filter(n->n%2==0).collect(Collectors.toList());
	   
	   System.out.println("Using strem print even number in another collection " +evennumber);
	   
	   
	   
	   // print even number using stream without storing in another collection
	
	addnumber.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	}


