package javaBasics;

public class WrapperClass {

	public static void main(String[] args) {
		String s = "12.24";
		System.out.println(s+1.12);
		double t=Double.parseDouble(s); //Wrapper class is a data conversion
		System.out.println(t+1.12);
		int i=10;
		System.out.println(i+1);
		//int to string
		String j= String.valueOf(i);
		System.out.println(j+1);

	}

}
