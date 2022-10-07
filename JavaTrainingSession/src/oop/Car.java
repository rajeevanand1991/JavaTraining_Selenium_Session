package oop;

public class Car {
	
	//Method Hiding
	public static void start() {
		System.out.println("Car -- start");
	}
	
	//Method Overloading allowed
	public static void start(int a) {
		System.out.println("Car -- start");
	}
	
	//Method Overloading allowed
	public static void start(String price) {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
}