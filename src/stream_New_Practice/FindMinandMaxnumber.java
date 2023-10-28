package stream_New_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinandMaxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberlist = Arrays.asList(2,3,4,5,6,7,8,9,10);
		Optional<Integer> min =numberlist.stream().min((num1,num2)->{return num1.compareTo(num2);   });
	
	  System.out.println(min.get());
	  
	  
	  
	  //find maximum number
	  
	  Optional max = numberlist.stream().max((num1,num2)->{return num1.compareTo(num2);});
	  
	  System.out.println(max.get());
	  
	}

}
