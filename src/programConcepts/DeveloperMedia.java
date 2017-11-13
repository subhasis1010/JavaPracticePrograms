/**
 * 
 */
package programConcepts;

/**
 * @author Su6z4o7
 *
 */
public class DeveloperMedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Returns false with the below statement but returns true with .equals operator
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1==s2:"+ s1==s2);
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));

		boolean flag=true;
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
		
		String str = null;
		String str1="abc";
		System.out.println(str1.equals("abc") || str.equals(null));
	}

}
