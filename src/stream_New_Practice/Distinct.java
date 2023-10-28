package stream_New_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> vehicles = Arrays.asList("Car","Bike","Bus","rickshaw","Car","Bike");
        vehicles.stream().distinct().forEach(n->System.out.println(n));
        
        long count = vehicles.stream().distinct().count();
        
        System.out.println(count);
	}

}
