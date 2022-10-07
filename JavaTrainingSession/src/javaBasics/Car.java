package javaBasics;

public class Car { //This is the blueprint of the class.
	// Class having variables and constructor methods
	// By creating different or n number of object to set different property or perform different action
	
	String name;
	String modelNumber;
	int price;
	String engine;
	
	public Car(String name, String modelNumber,int price, String engine) {
		this.name = name;
		this.modelNumber = modelNumber;
		this.price = price;
		this.engine = engine;	
	}

	public static void main(String[] args) {
		Car obj1 = new Car("BMW", "X5", 10, "Automatic");
		Car obj2 = new Car("Audi", "A8", 25, "Automatic");
		Car obj3 = new Car("Honda", "City", 5, "Manual");
		System.out.println(obj1.name +" " +obj1.modelNumber +" " +obj1.price+ " " +obj1.engine);
	}
}