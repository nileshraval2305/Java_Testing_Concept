package lamdaExpression;

import java.util.function.Predicate;

public class PredicateDemo1 {

	//predicate only argument and return always boolean value.
	//use only to check conditional checks in programing.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //ex 1
		Predicate <Integer> p = (i)->(i>10);
		System.out.println(p.test(5));
		System.out.println(p.test(20));
  
		//ex 2 - Given String length is greater than 5. 
	
	
		Predicate<String> pr = S->(S.length()>5);
		
		System.out.println(pr.test("Welcome"));
		System.out.println(pr.test("ABC"));
		
	}

}
