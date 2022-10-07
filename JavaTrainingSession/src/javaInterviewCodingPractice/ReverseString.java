package javaInterviewCodingPractice;

public class ReverseString {

	public static void main(String[] args) {
		String a="Abhirami";
		System.out.println(a.length());
		char b[]=a.toCharArray();
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(b[i]);
		}
		}

	}


