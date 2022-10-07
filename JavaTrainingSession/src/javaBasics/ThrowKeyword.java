package javaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		//Example 1
		System.out.println("ABC");
		
			try {
				throw new Exception("Rajeev Exception"); // call Exception class constructor
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("PQR");
		
		/* Output for Example 1:
		ABC
		java.lang.Exception: Rajeev Exception
					at javaBasics.ThrowKeyword.main(ThrowKeyword.java:11)
		PQR */
		
		//Example 2 for executing Test Cases based on Action flag column from Excel file
		String Exec_Flag = " ";
		if(Exec_Flag.equals(" ")) {
			try {
				throw new Exception("Exec flag is Blank Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*Output for Example 2:
		java.lang.Exception: Exec flag is Blank Exception
				at javaBasics.ThrowKeyword.main(ThrowKeyword.java:29)*/
	}
}