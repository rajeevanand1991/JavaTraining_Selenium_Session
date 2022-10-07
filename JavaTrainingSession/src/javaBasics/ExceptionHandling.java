package javaBasics;

public class ExceptionHandling {
	int a=10;

	public static void main(String[] args) {
		
		//Un caught Exception
		/*int i = 9/0;
		System.out.println(i);*/ // ArthmeticException
		
		//caught Exception
		//Thread.sleep(2000); //Unhandled exception type InterruptedException
		
		/*
		ExceptionHandling obj = new ExceptionHandling();
		obj = null;
		System.out.println(obj.a);*/ //NullPointerException: Cannot read field "a" because "obj" is null
		
		//1. try-catch block will handle the Exception
		try {
			int i = 9/0; //This code will thow an Exception
		}
		catch(Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("ABC");
	}
}