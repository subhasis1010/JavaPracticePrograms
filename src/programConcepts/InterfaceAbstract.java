/**
 * 
 */
package programConcepts;

/**
 * @author Su6z4o7
 *
 */
abstract class BankROI
{
	abstract void rateOfInterest();
	
	abstract void imple1();
	
	void imple2()
	{
		System.out.println("this is the implementation");
	}
}

public class InterfaceAbstract extends BankROI
{
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BankROI ia = new InterfaceAbstract();
		ia.imple2();
		
		AccessMod aMod = new AccessMod();
	
	}

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void imple1() {
		// TODO Auto-generated method stub
		
	}

}
