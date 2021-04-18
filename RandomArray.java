/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 * @version 1.8 2021-03-26
 * @author Nisa Hauna
 */

public class RandomArray {
	public static void main(String[] args)
	{
		final int NMAX = 10;
		
		//allocate triangular array
		int [] [] odds = new int [NMAX +1][];
		for (int n = 0; n<=NMAX; n++)
			odds[n] = new int[n+1];
		
		//fill triangular array
		for (int n=0; n<odds.length; n++)
			for (int k=0; k<odds[n].length; k++)
			{
				//compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
		    
			int RandomArray = 1;
			for (int i=1; i<=k; i++)
				RandomArray = RandomArray*(n-i+1)/i;
			
			odds[n][k]=RandomArray;
			}
		
		//print triangular array
		for (int[] row : odds)
		{
			for (int odd : row)
				System.out.printf("%4d", odd);
			System.out.println();
		}
	}
}
