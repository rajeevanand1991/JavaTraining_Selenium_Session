package com.jdk8.lambdaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		Predicate<Integer> func = x -> x > 5;
		//Integer i[] = new Integer[] {10,20,30};
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,0,12);
		//list.add(40); size is fixed in array
		List<Integer> colList = list.stream().filter(func).collect(Collectors.toList());
		System.out.println(colList);
		
		//predicate with &&
		List<Integer> colList1 = list.stream().filter(x -> x >5 && x < 9).collect(Collectors.toList());
		System.out.println(colList1);
		
		//predicate with negate(); it's a ignore mean
		List<String> namesList = Arrays.asList("Rajeev", "Rajee", "Raje", "Raj", "Java", "Jav", "Ja", "J");
		Predicate<String> namesExp = x -> x.startsWith("Raj");
		List<String> newNamesList = namesList.stream().filter(namesExp.negate()).collect(Collectors.toList());
		System.out.println(newNamesList);
	}

}
