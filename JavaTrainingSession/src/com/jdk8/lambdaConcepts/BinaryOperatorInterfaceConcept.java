package com.jdk8.lambdaConcepts;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		BinaryOperator<Integer> func = (x1,x2) -> x1 + x2;
		int t = func.apply(20, 20);
		System.out.println(t);
		
		//BiFunction Interface
		BiFunction<Integer, Integer, Integer> func2 = (x1,x2) -> x1+x2;
		int result = func2.apply(50, 50);
		System.out.println(result);
		

	}

}
