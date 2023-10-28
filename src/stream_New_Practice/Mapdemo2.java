package stream_New_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee 
{
	String emailId;
	String employeeName;
	int salary;
	
	
	Employee(String emailid,String employeeName,int salary)
	{
		this.emailId=emailid;
		this.employeeName =employeeName;
		this.salary=salary;
	}
}







public class Mapdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee> employlist =  Arrays.asList(
		new Employee("abc@gmail.com", "Nilesh", 200000),
				new Employee("dev@gmail.com", "devesh", 20000),
				new Employee("kelly@gmail.com", "kelly", 30000),
				new Employee("jenil@gmail.com", "Jenil", 40000));
		
		List<Integer> empsalary = employlist.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
	  System.out.println(empsalary);
	
	}

}
