package javaInterviewQuestions;

public class NullConcept {
	
	static Object obj;
	static String str;
	static NullConcept nc;
	
	public static void main(String[] args) {
		//1. case sensitive:
		//Object obj = null; //allowed
		//Object obj1 = Null; //Not Allowed
		//Object obj2 = NULL; //Not Allowed
		
		//2. Default reference value is always null
		System.out.println(obj); 
		System.out.println(str); 
		System.out.println(nc);
		
		//3.
		Integer i = null; //This Integer wrapper class allowed to declare null
	//	int j = i; // But primitive datatype int vaariable can not allowed to declare null, shows NullPointerException
		
		//4. instance of
		Integer k = null;
		Integer l = 10;
		System.out.println(l instanceof Integer); //true
		System.out.println(k instanceof Integer); //false
		
		//5. static vs non static
		NullConcept obj = null;
		//obj.send(); //Null pointer access: The variable obj can only be null at this location. Shows NullPointerException
		obj.sum(); // static method can access with null references as well without NullPointerException
		
		//6. == and != operator
		System.out.println(null == null); //true
		System.out.println(null != null); //false
		
		//7. default value of String
		String str = null;
		Integer i1 = null;
		Double d1 = null;
		
		String s1 = (String) null; // This null can allowed to append only not any other action
		System.out.println(s1); //null
		System.out.println(s1+"Rajeev"); //nullRajeev
		System.out.println(s1+"123"); //null123
		//System.out.println(s1.length()); // shows Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
		//System.out.println(s1.charAt(0)); // shows Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "s1" is null
		
		Integer i2 = (Integer) null;
		Double d2 = (Double) null;
		System.out.println(i2+2); // shows Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "i2" is null
		//System.out.println(i2.compareTo(1)); //shows Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.compareTo(java.lang.Integer)" because "i2" is null
		
	}
	
	public static void sum() { // It is static method
		System.out.println("sum...");
	}
	
	public void send() { //It is non static method
		System.out.println("send...");
	}
}