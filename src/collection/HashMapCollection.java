package collection;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> hs = new HashMap<Integer,String>();
    
    hs.put(1, "Nilesh");
    hs.put(2, "Devesh");
    hs.put(3, "Alay");
    hs.put(4, "Amrish");
    
    
    System.out.println(hs.get(3));
    
	}

}
