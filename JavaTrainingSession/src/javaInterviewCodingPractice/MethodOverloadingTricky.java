package javaInterviewCodingPractice;

public class MethodOverloadingTricky {
	
	/*
	 * Remember this sequence
	 * int, long, Integer, int...
	 * The above flow will maintain during execution*/
	
	public void print(Integer i) {
		System.out.println("Calling Integer wrapper class");
	}
	
	public void print(int... i) {
		System.out.println("Calling int.. array");

	}
	
	private void print(int i) {
		System.out.println("Calling int");
	}
	
	private void print(byte i) {
		System.out.println("Calling byte");
	}
	
	private void print(short i) {
		System.out.println("Calling short");
	}
	
	private void print(long i) {
		System.out.println("Calling long");
	}

	public static void main(String[] args) {
		MethodOverloadingTricky mot = new MethodOverloadingTricky();
		//int s[]= {1,2,3}; //array variable
		mot.print(10); //For long call use parameter as 10L

	}

}
