/**
 * First two max values in an array
 */
package samplePrograms;

/**
 * @author Su6z4o7
 *
 */
public class MaxTwo 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] array = {34, 45, 22,12, 67, 88, 2, 78};
		int largest = 0;
		int secondLarg = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				secondLarg = largest;
				largest = array[i];
			}
			else if(array[i]>secondLarg)
			{
				secondLarg = array[i];
			}
		}
		System.out.println("largest and second largest are "+largest+"--"+secondLarg);

	}

}
