package Upcasting;

import javax.management.remote.SubjectDelegationPermission;

public class upcasting_child extends upcasting_parent {

	private int a,b,sum;
	public int sum(int a,int b) {

        this.a =a;
        this.b =b;
		sum = this.a+this.b;
		return sum;
	}
	 public void display()
	{
		System.out.println("child method is called");
		super.display();
	}
	
	
	public static void main(String[] args) {
		
		
		//upcasting_child cd = new upcasting_child();
		//System.out.println(cd.sum(2, 5));
		//cd.display();
		
		upcasting_parent up = new upcasting_child();
		up.display();
       
	}

}
