package com.jdk8.lambdaConcepts;

import java.util.function.Function;

public class FunctionalInterfaceConcepts {

	public static void main(String[] args) {
		Function<String,Integer> func = x -> x.length();
		int length=func.apply("This is JAVA 8 Example");
		System.out.println(length);
		
		//chaining function
		Function<Integer,Integer> func2 = x -> x * 2;
		int result = func.andThen(func2).apply("Hello");
		System.out.println(result);

	}

}
