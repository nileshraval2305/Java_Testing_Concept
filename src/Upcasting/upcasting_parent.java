package Upcasting;

public class upcasting_parent {


	private int a,b,sum;
	
	
	public int sum(int a,int b) {

        this.a =a;
        this.b =b;
		sum = this.a+this.b;
		return sum;
	}
	
	public  void display()
	{
		System.out.println("Parent method is called");
	}
}
