package javaInterviewQuestions;

import java.util.Scanner;

public class PalindromeString {

	public static void isPalindromeString() {
		String original, reverse = "";

		Scanner in = new Scanner(System.in); // To get input from user
		System.out.println("Enter a string to check if it is a palindrome or not");

		original = in.nextLine();

		int length = original.length();
		
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		
		if (original.equals(reverse))
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string isn't a palindrome.");
	}

	public static void main(String[] args) {
		isPalindromeString();
		
		/*Output:
			Enter a string to check if it is a palindrome or not
			mam
			The string is a palindrome.*/
	}
}