package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapcollectionexaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String>hs = new HashMap<Integer,String>();
		
		
		hs.put(1, "Nilesh");
		hs.put(2, "Raval");
		hs.put(3, "Preksha");
		hs.put(4, "Jenil");
		
		System.out.println(hs);
		Set st = hs.entrySet();
		
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
		
			Map.Entry<Integer, String> mp = (Entry<Integer, String>) it.next();
			System.out.println( mp.getKey());
			System.out.println(mp.getValue());
		}

		
	}

}
