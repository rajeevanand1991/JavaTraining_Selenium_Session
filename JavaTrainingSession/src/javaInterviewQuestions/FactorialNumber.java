package javaInterviewQuestions;

public class FactorialNumber {
	
	//1. Without recursive -- use simple for loop
	
	public static int factorial(int num) {
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i; //fact 4 will iterate 1*2*3*4
		}
		
		/*This is my logic using decrement operator 
		for(int i=num;i>=1;i--) {
			fact=fact*i; //fact 4 will iterate 4*3*2*1
		}*/
		
		return fact;
	}
	
	//2. With recursive function: -- Inside function body calling that same function
	//A function is calling itself.
	
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return (num * fact(num-1)); //4*3*2*1
		
	}
	public static void main(String[] args) {
		//Without recursive function:
		System.out.println(factorial(4)); //Output: 24
		System.out.println(factorial(1)); //Output: 1
		System.out.println(factorial(0)); //Output: 1
		System.out.println(factorial(5)); //Output: 120
		
		//With recursive function:
		System.out.println("----------- Using Recursive function --------");
		System.out.println(fact(3)); //Output: 6
		System.out.println(fact(4)); //Output: 24
		System.out.println(fact(5)); //Output: 120
		System.out.println(fact(10)); //Output: 3628800
		System.out.println(fact(1)); //Output: 1
		System.out.println(fact(0)); //Output: 1
	}
}