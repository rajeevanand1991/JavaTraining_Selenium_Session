package com.jdk8.lambdaConcepts;

public class LambdaDeclaration {

	public static void main(String[] args) {
		WebPage w1 =  (String value, int age) -> { // This is lambda declaration
				System.out.println("Hi... "+value + " My age is "+age);	
		};
		// This is same as lambda declaration
		//WebPage w2 =  (value) -> {System.out.println(value.toUpperCase()); };
		//WebPage w3 = (n) -> System.out.println(n.length());
		

		w1.header("rajeev",31);
		//w2.header("google");
		//w3.header("anand");
	}

}
