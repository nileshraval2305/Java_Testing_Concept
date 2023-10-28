package lamdaExpression;


	interface MyFunctionalInterface {
	    void myMethod();
	}


	
	public  class Lambda_Demo
	{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MyFunctionalInterface myLambda = () -> System.out.println("Hello This is first lambda expression");
		myLambda.myMethod();

	}

	}
	
	
