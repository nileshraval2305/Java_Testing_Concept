package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class sorting {

	
	@Test
	public void Sorting()
	{
		
		List<String> name = Arrays.asList("nilesh","Jenil","Preksha","Raghi","niyati");
		//name.stream().filter(s->s.startsWith("n")).sorted().forEach(s->System.out.println(s));
		
	}
	
	
	@Test
	public void ConcatStream()
	{
		
		List<String> name = Arrays.asList("nilesh","Jenil","Preksha","Raghi","niyati");
		List<String> name1 = Arrays.asList("vipul","Alpesh","Sanjay","rinku","bhumil");
		
		//name.stream().filter(s->s.startsWith("n")).sorted().forEach(s->System.out.println(s));
		Stream<String> main = Stream.concat(name.stream(), name1.stream());
		
		main.sorted().forEach(s->System.out.println(s));
	}
	
	
}
