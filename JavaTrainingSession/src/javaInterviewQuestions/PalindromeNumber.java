package javaInterviewQuestions;

public class PalindromeNumber {
	
	public static void isPalindromeNumber(int num) {
		System.out.println("Given number is : "+num);
		int r=0; // reverse variable
		int sum=0;
		int t;
		
		t=num; //t=151
		
		while(num>0) {
			r = num%10; //Get the remainder
			sum = (sum*10)+r;
			num=num/10;
		}
		
		if(t==sum) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not palindrome number");
		}
	}

	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(152);
		isPalindromeNumber(78987);
		isPalindromeNumber(1);
		isPalindromeNumber(1110);
		isPalindromeNumber(0);
		isPalindromeNumber(-1);
		
		/*Output:
		Given number is : 151
		Palindrome number
		Given number is : 152
		Not palindrome number
		Given number is : 78987
		Palindrome number
		Given number is : 1
		Palindrome number
		Given number is : 1110
		Not palindrome number
		Given number is : 0
		Palindrome number
		Given number is : -1
		Not palindrome number*/
	}
}