/**
 * 
 */
package programConcepts;

/** Learn some basic java topics like constructors etc
 * @author Su6z4o7
 *
 */
public class Car 
{

	/**Create a constructor
	 * @param args
	 */
	
	String sModel;
	int iGear;
	int iHighestSpeed;
	boolean bleftHandDrive;
	String sTransmission;
    int iTyres;
    int iDoors;
    int iMake;
    String sColor;
	
	
	public Car(String model, int make, Boolean leftHandDrive)
	{
		sModel = model;
		iMake = make;
		bleftHandDrive = leftHandDrive;
		int a=40;
		
	}
	
	//Here we are also creating a method
	
	 public void DisplayCharacterstics()
	 {
	    	System.out.println("Model of the Car: " +  sModel);
	    	System.out.println("Number of gears in the Car: " +  iGear);
	    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
	    	System.out.println("Color of the Car: " +  sColor);
	    	System.out.println("Make of the Car: " +  iMake);
	    	System.out.println("Transmission of the Car: " +  sTransmission);
	 
	    }
	
	
	 
	public static void main(String[] args) 
	{
		Car Toyota  = new Car("Camry", 4, true);
		Toyota.iDoors = 4;
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 80;
		Toyota.sColor = "Creme";
		Toyota.iMake = 2015;
		Toyota.sTransmission = "Manual";
		
		//System.out.println(a);

	}

}
