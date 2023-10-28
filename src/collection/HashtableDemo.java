package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
           ht.put(1, "Nilesh");
           ht.put(2, "Jenil");
           ht.put(3, "Devesh");
           ht.put(4, "Khushi");
           ht.put(5, "Raghi");
         
           System.out.println(ht);
           //get the key
           System.out.println(ht.get(5));
           ht.remove(3);
          //remove key and value 
           System.out.println(ht);
           
          //validate to check contains key is exist or not 
            System.out.println(ht.containsKey(4));
            
         //validate to check contains value 
            
            System.out.println(ht.containsValue("Khushi"));
            
            //get all the keyset from hashtable 
           
            System.out.println(ht.keySet());
            
            //get all the value from hashtable
            
            System.out.println(ht.values());
            
            //KeySet - this method is used to get key with data value
           
            for(Object k : ht.keySet())
            {
            	System.out.println(ht.get(k));
            	
            }
            
     //Entryset method is get the key and value and using getkey and getvalue
            
            for(Map.Entry key : ht.entrySet())
            {
            	System.out.println(key.getKey() + " " + key.getValue());
            	
            }
     
            java.util.Set<Entry<Integer, String>> s = ht.entrySet();
            
            Iterator it = s.iterator();
            
            while(it.hasNext())
            {
             Map.Entry<Integer, String> key1 = (Entry<Integer, String>) it.next();	
            System.out.println(key1.getKey() + " " + key1.getValue());
            }
            
	}

}
