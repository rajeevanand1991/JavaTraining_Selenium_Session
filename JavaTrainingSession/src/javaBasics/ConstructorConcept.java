package javaBasics;

public class ConstructorConcept {
	
	//class variables or instance variables
	String name;
	int age;
	
	public  ConstructorConcept() { //This is constructor
		System.out.println("Default Constructor");
	}
	
	public  ConstructorConcept(int i) { //This is constructor overloading with 1 parameter
		System.out.println("1 param Constructor");
		System.out.println(i);
	}
	
	public  ConstructorConcept(int i, int j) { //This is constructor overloading with 2 parameter
		System.out.println("2 params Constructor");
		System.out.println(+i +" "+j);
	}
	
	public ConstructorConcept(String name, int age) {
		this.name = name; //this.class variable = local variable
		this.age = age;
	}
	
	public static void main(String[] args) {
		//new ConstructorConcept(); // Without reference variable, creating object to call constructor
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		ConstructorConcept obj3 = new ConstructorConcept("Tom",25);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}
}