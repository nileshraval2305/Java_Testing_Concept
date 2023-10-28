package stream_New_Practice;

import java.util.ArrayList;

public class Stream_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//map is basically used to  perform modified operation in current collection list
		
ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("Nilesh");
		names.add("Presksha");
		names.add("Nikki");
		names.add("Nitin");
		
		
		
	names.stream().filter(s->s.startsWith("N")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		
	}

}
