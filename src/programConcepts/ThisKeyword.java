/**
 * 
 */
package programConcepts;

/**
 * Understanding this keyword
 * @author Su6z4o7
 *
 */
public class ThisKeyword extends BankROI
{
	int id;
	String name;
	
	public ThisKeyword()
	{
		System.out.println("This is the default constructor");
	}
	
	public ThisKeyword(int id, String name)
	{
		//this();
		this.id = id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+"---"+name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ThisKeyword this1 = new ThisKeyword(111, "John");
		ThisKeyword this2 = new ThisKeyword(222, "Peter");
		ThisKeyword this3 = new ThisKeyword();
		this1.display();
		this2.display();
		this3.display();
	}

	public void rateOfInterest() {
		// TODO Auto-generated method stub	
	}

	@Override
	void imple1() {

	}
}
