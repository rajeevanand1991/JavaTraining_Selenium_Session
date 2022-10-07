package javaBasics;

public class ThrowsKeyword {

	//obj.sum() having Exception, so we used throws here and JVM will catch the caught Exception
	public static void main(String[] args) throws ArithmeticException { 
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("Remaining Execution");
	}
	
	/*This is Exception Hierarchy
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at javaBasics.ThrowsKeyword.div(ThrowsKeyword.java:24)
		at javaBasics.ThrowsKeyword.sum(ThrowsKeyword.java:20)
		at javaBasics.ThrowsKeyword.main(ThrowsKeyword.java:8)*/
	
	public void sum() throws ArithmeticException { //div() having Exception, so we used throws here
		//Now we are handling the exception here, without reaching to JVM
		try {
		div();
		} catch (ArithmeticException e) {
		
		}
	}
	
	public void div() throws ArithmeticException { //Throwing ArithmeticException
		int i = 9/0; // Exception line
	}
}