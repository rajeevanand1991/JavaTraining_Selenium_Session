package javaInterviewCodingPractice;

public class Fibonacci {

	public static void main(String[] args) {
		int num=10, a=0,b=0,c=1;
		 	for(int i=0;i<num;i++) {
		 		a=b;
		 		b=c;
		 		c=a+b;
		 		System.out.print(a + " ");
		 		
		 	}
		}

}
