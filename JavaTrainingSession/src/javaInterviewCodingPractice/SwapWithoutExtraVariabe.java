package javaInterviewCodingPractice;

public class SwapWithoutExtraVariabe {

	public static void main(String[] args) {
		int x=10,y=20;
		System.out.println("Before Swap for X ===> " +x  + " and Y ==> " +y );
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swap for X ===> " +x  + " and Y ==> " +y );

	}

}
