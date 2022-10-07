package oop;

public class BMW extends Car{
	
	/*@Override
	public void start() { //Will get this error in sub class BMW, The method start() of type BMW must override or implement a supertype method*/
	public static void start() { // we need to include static in sub class method start, when parent class Car has static method for start
		System.out.println("BMW -- start");
	}
}