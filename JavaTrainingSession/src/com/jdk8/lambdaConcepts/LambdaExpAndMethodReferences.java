package com.jdk8.lambdaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReferences {

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Tom", "Peter", "Rajeev", "Simon");
		//for loop
		System.out.println("---- Using For Loop ------");
		for(int i=0; i<namesList.size();i++) {
			System.out.println(namesList.get(i));
		}
		
		// Enhanced For loop
		System.out.println("---- Using Enhanced For loop ------");
		for (String t:namesList) {
			System.out.println(t);
		}
		
		//with Anonymous class:
		System.out.println("---- Using Anonymous class ------");
		namesList.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});

		// Lambda Expression: ->
		System.out.println("---- Using Lambda Expression ------");
		namesList.forEach(str -> System.out.println(str));
		
		//Method References
		System.out.println("---- Using Method References ------");
		namesList.forEach(System.out::println);
	}

}
