package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Nilesh");
		hs.add("Dev");
		hs.add("Preksha");
		hs.add("Preksha");
		System.out.println(hs);
		
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext())
		{
			
			
			System.out.println(it.next());
		}
	}

}
