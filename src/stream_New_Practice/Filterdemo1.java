package stream_New_Practice;

import java.util.ArrayList;

public class Filterdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//count name which start with N letters using stream
		
		
		
		ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("Nilesh");
		names.add("Presksha");
		names.add("Nikki");
		names.add("Nitin");
		int count= 0;
		
		
	
		for(int i=0;i<names.size();i++)
		{
			
			
			if(names.get(i).startsWith("N"))
			{
				count++;	
			  
			  
			}
		
		  
		}
		
		System.out.println(" Total Names start with N letter " +count);
	
	
	 //using stream 
		
		long l = names.stream().filter(name->name.startsWith("N")).count();
	
		System.out.println(" Total Names start with N letter using stream " +l);
	
	
	
	}
		
	
   
	


}


