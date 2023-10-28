package superandthiskeyword;

public class Thiskeyword {
    
	 int a=3;
	
	
	 public void getdata(int a)
	 {
		int c = this.a+a;
		 System.out.println(c);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword t = new Thiskeyword();
		t.getdata(5);
	}

}
