package Java_Stream;

import java.util.Arrays;
import java.util.List;

public class sortuniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	  List<Integer> num = Arrays.asList(1,5,2,6,9,3,2,4,8,5,8);
	  num.stream().sorted().distinct().forEach(s->System.out.println(s));
	}

}
