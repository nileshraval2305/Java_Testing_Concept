package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;
@Test
public class StreamCollect {

	
	@Test
	public void StreamtoCollection()
	{
		
	List<String> ls = Stream.of("nilesh","niyati","Preksha","Jenil","Khushi").filter(s->s.startsWith("n")).collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	
	List<Integer> numbers = Arrays.asList(12,3,4,3,2,10,11,1,5,7,6,8,9);
	//remove duplicate numbers then sorted
	
	numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
}
	
}
