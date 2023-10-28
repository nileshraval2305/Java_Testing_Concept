package Practical;

import java.util.ArrayList;

public class unicnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 2, 3, 2, 2, 1, 4, 5, 4, 5, 6, 6, 7 };
	        ArrayList<Integer> arr = new ArrayList<Integer>();

	        for (int i = 0; i < a.length; i++) {
	            int k = 0;

	            if (!arr.contains(a[i])) {
	                arr.add(a[i]);
	                k++;
	            }

	            for (int j = i + 1; j < a.length; j++) {
	                if (a[j] == a[i]) {
	                    k++;
	                }
	            }
	            if (k == 1) {
	                System.out.println(a[i] + " is a unique number");
	            }
	        }

	        System.out.println("Unique numbers: " + arr);
	        
	        
	    }
	}
	








