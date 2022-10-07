package javaBasics;

public class SingletonConcept {
	
	private static SingletonConcept singleton_instance = null;
	public String str;
	
	private SingletonConcept() {
		str = "Hey I am using Singleton class pattern";
	}
	
	public static SingletonConcept getInstance() {
		if (singleton_instance == null)
			singleton_instance = new SingletonConcept();
		return singleton_instance;
	}

	public static void main(String[] args) {
		// Always static method can call it directly using class name itself
		SingletonConcept x = SingletonConcept.getInstance();
		SingletonConcept y = SingletonConcept.getInstance();
		SingletonConcept z = SingletonConcept.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		
		//here singleton_instance is not null already class initialization done for x reference, 
		//so variable y reference pointing to same x variable 
		System.out.println(y.str); 
		
		//here singleton_instance is not null already class initialization done for x reference,
		//so variable y reference pointing to same x variable
		System.out.println(z.str); 
		
		/*Output:
		HEY I AM USING SINGLETON CLASS PATTERN
		HEY I AM USING SINGLETON CLASS PATTERN
		HEY I AM USING SINGLETON CLASS PATTERN*/
		
		//if modification done in any one reference, will affect to remaining 2 references as well
		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str); 
		System.out.println(z.str);
		
		/*output:
		hey i am using singleton class pattern
		hey i am using singleton class pattern
		hey i am using singleton class pattern*/
	}
}