package Java_Stream;

import java.util.stream.Stream;

import org.testng.annotations.Test;

public class MapoperationInString {

	//String of Array convert to Upperacase
	@Test
	public void StreamUsingMap()
	{
		
	Stream.of("nilesh","niyati","Preksha","Jenil","Khushi").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	
	//String of Array start name with n letter and perform sorting operation with uppercase 
	@Test
	public void StreamUsingMapwithSortOperation()
	{
		
	Stream.of("nilesh","niyati","Preksha","Jenil","Khushi").filter(s->s.startsWith("n")).sorted().forEach(s->System.out.println(s));
		
	}


}
