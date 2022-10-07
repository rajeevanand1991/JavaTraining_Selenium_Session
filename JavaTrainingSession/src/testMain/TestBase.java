package testMain;

public class TestBase {
	
	public static void main(String[] args) {
		System.out.println("main method-1");
		
		//if we want to call overloaded main method, we need to call explicitly inside this method only
		main("Testing");
		main(10);
		main(10, 20);
	}
	
	//Now main() got overloaded
	public static void main(String args) {
		System.out.println("main method-2");
	}
	public static void main(int a) {
		System.out.println("main method-3");
	}
	
	public static void main(int a, int b) {
		System.out.println("main method-4");
	}
}