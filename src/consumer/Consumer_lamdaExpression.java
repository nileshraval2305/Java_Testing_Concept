package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class employee
{
	String ename;
	String gender;
	int Salary;
	
	employee(String ename,String gender,int Salary)
	{
		this.ename =ename;
		this.gender=gender;
		this.Salary= Salary;
		
	}
}



public class Consumer_lamdaExpression {


	
	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> emp = new ArrayList<employee>();
		
		emp.add(new employee("Nilesh", "Male", 200000));
		emp.add(new employee("Devesh", "Male", 60000));
		emp.add(new employee("Devki", "Female", 70000));
		emp.add(new employee("Janki", "Female", 40000));
	
	   //lambda function 
		
		Function<employee,Integer> f = emplist->(emplist.Salary*10/100);
		
		//predicate function
		
		Predicate <Integer> p = b->b>=5000;
		
	   Consumer <employee> c = emplist ->{
		   
		   System.out.println(emplist.ename);
		   System.out.println(emplist.Salary);
		   System.out.println(emplist.gender);
	   };
	
	
	   for(employee e:emp)
	   {
		   int bonus = f.apply(e);
	
	   if(p.test(bonus))
	   {
		   c.accept(e);
		   System.out.println("Employee bonus" +bonus);
	   }
	   
	
	}
	
	
	}

}
