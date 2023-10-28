package stream_New_Practice;

import java.util.ArrayList;

public class Find_length_Using_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Nilesh");
		arr.add("Jenil");
		arr.add("Nil");
		arr.add("preksha");
		arr.add("Ru");
		
		
		arr.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		
		
	}

}
