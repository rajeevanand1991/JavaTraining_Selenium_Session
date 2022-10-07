package javaInterviewQuestions;

public class ArmstrongNumber {
	
	public static void isArmstrongNumber(int num) {
		//153 1*1*1			5*5*5			3*3*3
		//This program logic will comes from last number which is 3 to first number which is 1
		System.out.println("Given number is: "+num);
		int cube = 0;
		int r; // To store remainder
		int t; // To store temporary variable value
		
		t=num; //t is 153 now
		
		while(num>0) {
			r=num%10; //will get last number by modulus of 10
			num=num/10;
			cube = cube+(r*r*r);
		}
		
		if(t==cube) {
			System.out.println("This is an Armstrong number");
		} else {
			System.out.println("This is not an Armstrong number");
		}
		
	}

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(371);
		isArmstrongNumber(370);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(455);
		/* Output:
		 Given number is: 153
		This is an Armstrong number
		Given number is: 371
		This is an Armstrong number
		Given number is: 370
		This is an Armstrong number
		Given number is: 0
		This is an Armstrong number
		Given number is: 1
		This is an Armstrong number
		Given number is: 455
		This is not an Armstrong number*/
	}
}