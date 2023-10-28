package Java_Stream;

import java.util.ArrayList;

import collection.Arraylist;

public class SortingbyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("nilesh");
		a1.add("niyati");
		a1.add("Preksha");
		a1.add("Jenil");
		a1.add("Khushi");
		
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).startsWith("n"))
			{
				
				count++;
			}
			
		}
		
		System.out.println("total count of name start with N" +count);
	}
	
}
