package com.jdk8.lambdaConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		UnaryOperator<Integer> func = x -> x*7;
		int n1 = func.apply(10);
		System.out.println(n1);
		
		//Function interface performs same on UnaryOperato interface calls same method apply
		Function<Integer, Integer> func2 = x -> x*10; 
		System.out.println(func2.apply(40));
		
		List<String> langList = new ArrayList<String>();
		langList.add("Java");
		langList.add("Ruby");
		langList.add("Python");
		langList.add("Scala");
		langList.add("R");
		System.out.println(langList);
		langList.replaceAll(ele -> ele + " Rajeev");
		System.out.println(langList);
	}

}
