package javaInterviewQuestions;

public class PrimeNumber {

	// A number that can be divided exactly only by itself and 1, 
	// for example 2, 7, 17 and 41.
	// 2 is the lowest prime number
	
	// This method will show whether it is prime number or not as per user input
	
	public static boolean isPrimeNumber(int num) {
		//edge/corner cases:
		if(num <= 1) { //check condition maximum 1 and below numbers
			return false;
		}
		
		for(int i = 2;i < num;i++) {
			if(num % i == 0) { //condition is remainder should be 0
				return false;
			}
		}
		return true;
	}
	
	// This method will give prime number or not based on ranges of number
	
	public static void getPrimeNumbers(int num) {
		System.out.println("Prime number upto: "+num);
		
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i +" ");	
			}
		}
		System.out.println(); // This statement not mandatory, just for alignment purpose
	}
	
	public static void main(String[] args) {
		System.out.println("2 is prime number: "+isPrimeNumber(2));
		System.out.println("3 is prime number: "+isPrimeNumber(3));
		System.out.println("5 is prime number: "+isPrimeNumber(5));
		System.out.println("10 is prime number: "+isPrimeNumber(10));
		System.out.println("17 is prime number: "+isPrimeNumber(17));
		
		System.out.println("0 is prime number: "+isPrimeNumber(0));
		System.out.println("1 is prime number: "+isPrimeNumber(1));
		
		System.out.println("-2 is prime number: "+isPrimeNumber(-2));
		
		/*Output:
		2 is prime number: true
		3 is prime number: true
		5 is prime number: true
		10 is prime number: false
		17 is prime number: true
		0 is prime number: false
		1 is prime number: false
		-2 is prime number: false*/
		
		getPrimeNumbers(5); /* output: Prime number upto: 5
									   2 3 5 */ 
		
		getPrimeNumbers(7); /* output: Prime number upto: 7
									   2 3 5 7 */ 
		
		getPrimeNumbers(13); /* output: Prime number upto: 13
										2 3 5 7 11 13 */ 
		
		getPrimeNumbers(20); /* output: Prime number upto: 20
									    2 3 5 7 11 13 17 19 */ 
	}
}