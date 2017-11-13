/**
 * Java program to print Fibonacci series upto 100
 */
package samplePrograms;

/**
 * @author Su6z4o7
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		fibonacciSeries();
	}
	
	private static void fibonacciSeries()
	{
		int[] series = new int[100];
		series[0] = 0;
		series[1] = 1;
		for(int i=2;i<20;i++)
		{
			series[i] = series[i-1]+series[i-2];
			if(series[i]<100) //condition to check if the max no in series is less than 100
			{
				System.out.println(series[i]);
			}
		}
	}
	
	

}
