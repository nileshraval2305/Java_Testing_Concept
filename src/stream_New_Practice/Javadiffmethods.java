package stream_New_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Javadiffmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Sorted Arrays of numbers 
		
		List<Integer> numbers = Arrays.asList(6,3,2,5,7,9,1,4,8);
		
		numbers.stream().sorted().forEach(num->System.out.println(num));
		
		
		
		//Reverse array of numbers 
		System.out.println();
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(num->System.out.println(num));
		
		
		
		//Sort String in Arraylist
		
		List<String> names = Arrays.asList("Nilesh","Preksha","Jenil","Khushi","Raghi","Siya","Jash");
		
	 List<String> Sortednames =	names.stream().sorted().collect(Collectors.toList());
	
	  System.out.println(Sortednames);
	
	//Sort reverse String in Arraylist
	  List<String> reverseordernames =	names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
	  System.out.println(reverseordernames);
	
	}

}
