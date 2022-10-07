package javaBasics;

public class FunctionsInJava {

	//main method will do auto call by JVM and it should be always void to make it not return any value
	public static void main(String[] args) {
		/*Cannot make a static reference to the non-static method test() from the type FunctionsInJava
		test();*/
		
		/*So we need to create an object of class with new keyword
		  also we need to give reference name like obj to call that object (because it is like an new born baby)
		  to access non static method or variable in static main method
		  Object can store only non-static methods/functions */
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int d = obj.sum();
		System.out.println(d);
		
		String s1 = obj.PQR();
		System.out.println(s1);
		
		int d2 = obj.div(30, 10);
		System.out.println(d2);
		int d3 = obj.div(50, 5);
		System.out.println(d3);
		
		String s2 = obj.sendMail(15, "Rajeev");
		System.out.println(s2);
		

	}
	
	//1. cannot create a function inside a function
	//2. functions are independent to each other
	//3. functions are parallel to each other
	//4. main() method does not return any value, hence it is void
	
	//1. no input no output (no return values)
	//void -- does not return any values
	public void test() { //0 param
		System.out.println("test method");
	}
	
	public void test(int i) { //1 param
		System.out.println("test method");
	}
	
	public int test(int i, int j) { //2 param
		System.out.println("test method");
		return 10;
	}
	
	public void test(String a, String b) { //2 param
		System.out.println("test method");
	}
	
	//2. no input some output
	//return type -- int
	public int sum() {
		System.out.println("SUM method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	public String PQR() {
		System.out.println("PQR method");
		String s = "Selenium";
		return s;
	}
	
	//3. some input	some output
	public int div(int x, int y) {
		System.out.println("DIV method");
		int z = x/y;
		return z;
	}
	
	public String sendMail(int p, String q) {
		System.out.println("send mail method");
		String h = q+p; //here will perform concatenation operation because having String with integer
		return h;
	}
}