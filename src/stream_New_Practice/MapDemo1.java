package stream_New_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 List<String> vehicles = Arrays.asList("truck","car","bus","train","bike","scooter");
	 List<String> uppercaseveh = new ArrayList<String>();
	 
	 uppercaseveh = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	 System.out.println(uppercaseveh);
	 
	 vehicles.stream().map(name->name.length()).forEach(len->System.out.println(len));
	 System.out.println();
	 // using map multiple operation using arraylist
	 
	 List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	 
	 
	 numbers.stream().map(num->num*3).forEach(num->System.out.println(num));	 
	}

}
