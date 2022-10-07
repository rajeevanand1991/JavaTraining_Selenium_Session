package javaBasics;

public class StringConcept {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java"; //Now this java value not creating separately. So it will point to same id, just s2 is refer here
		s2 = "Rajeev"; //immutable, now it will point to different id 
		String s3 = "c++";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
	}
}