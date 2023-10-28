package superandthiskeyword;

public class Childclass extends ParentClass{

	String Name ="Jenil";
	
	
	
	public Childclass()
	{
		super();
		System.out.println("I am calling child class constructor");
		
	}
	
	
	public void GetStringvalue()
	{
	    super.GetStringvalue();
		System.out.println("I am in child class");
	}
	
	
	public void Getdata()
	{
		
		System.out.println(Name);
		System.out.println(super.Name);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass cd = new Childclass();
		cd.Getdata();
		cd.GetStringvalue();
		
	}

}
