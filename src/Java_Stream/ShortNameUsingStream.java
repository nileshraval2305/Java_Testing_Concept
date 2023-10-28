package Java_Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class ShortNameUsingStream {

	
	
	@Test
	public void shortString()
	{
	 
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("nilesh");
		name.add("Devesh");
		name.add("niyati");
		name.add("nirali");
		
		long count = name.stream().filter(s->s.startsWith("n")).count();
		System.out.println(count);
		
	}

	
	@Test
	public void Streammapper()
	{
		
	
 Stream<Object> name =	Stream.of("nilesh","devesh","amrish","bhargav","Ravi").filter(s->s.endsWith("h")).map(s->s.toUpperCase());
	
	System.out.println(name);
	}
	}



