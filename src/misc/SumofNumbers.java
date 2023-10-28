package misc;

public class SumofNumbers {

	static int getSum(int n)
    {   
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            System.out.println(n);
            n = n/10;
           System.out.println(n);
        
        
        }
     
    return sum;
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int n = 687;
 
        System.out.println(getSum(n));
    }
}
