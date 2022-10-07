package javaBasics;

public class ConstructorThisSuperConcept extends A{
	
	ConstructorThisSuperConcept(){
		super(10);
		System.out.println("Child Class constructor -- Default constructor");
	}

	ConstructorThisSuperConcept(int i){
		System.out.println("single param constructor");
		System.out.println("the value of i "+i);
	}
	
	ConstructorThisSuperConcept(int i, int j){
		System.out.println("two params constructor");
		System.out.println("the value of i "+i);
		System.out.println("the value of j "+j);
	}
	public static void main(String[] args) {
		ConstructorThisSuperConcept obj1 = new ConstructorThisSuperConcept();
		ConstructorThisSuperConcept obj2 = new ConstructorThisSuperConcept(10);
		ConstructorThisSuperConcept obj3 = new ConstructorThisSuperConcept(20,30);
	}

}
