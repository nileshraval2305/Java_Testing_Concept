package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashsetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//perform union operation using two hash set; 
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(30);
		hs2.add(40);
		hs2.add(50);
		
		//perform union 
		hs1.addAll(hs2);
		System.out.println("Union operation of hs1 and hs2 " +hs1);
	
		//sort hash set
		List<Integer> ar = new ArrayList<>(hs1);
		Collections.sort(ar);
	  System.out.println(ar);

	  //insect hast set using retainall function
	  
	  hs1.retainAll(hs2);
	  
	  System.out.println(hs1);
	  List<Integer> ar1 = new ArrayList<>(hs1);
		Collections.sort(ar1);
	  System.out.println(ar1);
	  
	  // difference using removeall method
      hs1.removeAll(hs2);
	  
	  List<Integer> ar3 = new ArrayList<>(hs1);
	  
	  Collections.sort(ar3);
	  
	  System.out.println(ar3);
	  
	}

}
