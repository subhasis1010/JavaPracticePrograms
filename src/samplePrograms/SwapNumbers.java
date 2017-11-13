/**
 * How to Swap two numbers without using third variable in Java
 */
package samplePrograms;

/**
 * @author Su6z4o7
 *
 */
public class SwapNumbers 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int number1 = 234;
		int number2 = 456;
		System.out.println("Numbers before swap are "+number1+"---"+number2);
		number1 = number1*number2;
		number2 = number1/number2;
		number1 = number1/number2;
		System.out.println("Numbers after swap are "+number1+"---"+number2);
	}

}
