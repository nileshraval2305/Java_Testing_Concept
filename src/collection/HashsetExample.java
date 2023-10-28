package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Selenium");
		hs.add("Selenium");
		hs.add("Java");
		hs.add("Typescript");
		hs.add("Javascript");
		hs.add("Playwright");

				
		System.out.println(hs);
       Iterator<String> it =  hs.iterator();
	
       while(it.hasNext())
       {
    	   
    	  System.out.println(it.next()); 
       }
	
	}

}
