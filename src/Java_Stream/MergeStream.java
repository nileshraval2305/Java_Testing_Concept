package Java_Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class MergeStream {

	
	@Test
	public void mergeStream()
	{
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Nilesh");
		name.add("Preksha");
		name.add("Jenil");
	
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("Khushi");
		name1.add("Siya");
		name1.add("Jash");
	
		
		Stream <String> MergeString = Stream.concat(name.stream(), name1.stream()).sorted().map(s->s.toUpperCase());
		//MergeString.forEach(s->System.out.println(s));
	
    boolean find  =	MergeString.anyMatch(s->s.equalsIgnoreCase("Jddash"));
	  
    System.out.println(find);
    
	
	}
	
	
}
