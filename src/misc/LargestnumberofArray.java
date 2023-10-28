package misc;

public class LargestnumberofArray {

	public static void main(String[] args) {
	
		int abc[][] = {{3,44,2},{2,5,6},{4,1,11}};
        int min = abc[0][0];
        int mincolumn=0;
        int max =0;
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				
				
				if(min>abc[i][j])
				{
					
					min=abc[i][j];
			        mincolumn= j;
				}
			}
		   int k = 0;
			
		    max = abc[0][mincolumn];
			
		   while(k<3)
			{
				
				if(max<abc[k][mincolumn])
				{
					  max = abc[i][mincolumn];     
				}
			k++;
			} 
			
		  	
		}
		
		System.out.println("max value is "+max);
	}

}
