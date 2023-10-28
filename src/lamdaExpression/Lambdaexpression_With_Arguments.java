package lamdaExpression;

@FunctionalInterface
interface CarDemo
{
	
	public String Bookcar(String Source,String Destination);
}








public class Lambdaexpression_With_Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDemo c=(Source,Destination)->
		{
			System.out.println("Booked Car from " +Source+ " To " +Destination);
		
		return "500";
		};
	
		String Booking_ID = c.Bookcar("Ahmedabad", "Baroda");
		System.out.println("Booking ID is "+Booking_ID);
        //c.Bookcar("Ahmedabad", "Baroda");
	}

}
