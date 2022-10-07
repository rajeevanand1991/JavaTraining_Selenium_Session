package com.jdk8.lambdaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		Consumer<String> func = x -> System.out.println(x);
		func.accept("Hi guys! This is Rajeev here...");
		
		//iterate list elements
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,0,12);
		list.forEach(x -> System.out.println(x));

	}

}
