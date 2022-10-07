package oop;

public class TestCar {

	//JVM will see this below format first to execute from any class
	public static void main(String[] args) {
		
		BMW b = new BMW();
		//BMW.start(); Warning: Now it is static in nature, so that we can call it via class name with method name instead of using object with method name
		b.start(); //This is an overridden method. Realtime Example: BMW has new separate feature to start car by Automatic or button start logic
		b.stop(); // This is using car parent class
		b.refuel(); // This is using car parent class	
	}
	
	//main method allowed to overload	
	public static void main(int a) {
		System.out.println("overloaded main method of single parameter");
	}
	
	//main method allowed to overload	
	public static void main(int a, int b) {
		System.out.println("overloaded main method of double parameter");
	}
}