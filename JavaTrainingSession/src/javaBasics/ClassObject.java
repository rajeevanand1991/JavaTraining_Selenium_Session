package javaBasics;

public class ClassObject {
	int door;
	int wheel;
	double airFilledWheel;
	float price;
	long engineNumber;
	char brand;
	String vehicleName;
	boolean insurance;

	public static void main(String[] args) {
		ClassObject a = new ClassObject();
		ClassObject b = new ClassObject();
		a.door=2;
		a.wheel=6;
		System.out.println(a.wheel);
		System.out.println(b.wheel);
		System.out.println(b.airFilledWheel);
		System.out.println(b.price);
		System.out.println(b.brand);
		System.out.println(b.insurance);
		System.out.println(b.vehicleName);
		System.out.println(b.engineNumber);
	}

}
