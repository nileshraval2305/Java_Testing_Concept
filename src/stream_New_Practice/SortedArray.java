package stream_New_Practice;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedArray {

	
	static ArrayList<String> names = new ArrayList<String>(); 
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		names.add("Nilesh");
		names.add("Presksha");
		names.add("Nakum");
		names.add("Nanu");
	
		
		//names.stream().filter(s->s.startsWith("N")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}

	
	@Test
	public void findNameinArrayList()
	{
		names.add("Nilesh");
		names.add("Presksha");
		names.add("Nakum");
		names.add("Nanu");
		boolean name= names.stream().anyMatch(s->s.equalsIgnoreCase("Nilesh"));
		System.out.println(name);
		Assert.assertTrue(name);
		
	}

	
	@Test
	public void SortedNumbers()
	{
		
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(9);
        number.add(3);
        number.add(5);
        number.add(7);
        number.add(3);
        number.add(22);
        number.add(2);
        number.add(1);
        
        number.stream().distinct().sorted().forEach(s->System.out.println(s));
	}
	


}
	
