package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		List<Customer> customersList= Arrays.asList(
				new Customer("Rajeev", 31),
				new Customer("Steve", 34),
				new Customer("Abhirami", 27),
				new Customer("Thompson", 23)
				);
		
		 String name =customersList.stream()
						.filter(x -> "Abhirami".equals(x.getName()))
						.map(Customer::getName)
						.findAny()
						.orElse(null);
		 System.out.println(name);
		 
		 //print all the names from the list
		 List<String> custList = customersList.stream()
				 					.map(Customer::getName)
				 					.collect(Collectors.toList());
		 custList.forEach(ele -> System.out.println(ele)); 
		 custList.forEach(System.out::println); // Using Method References, Both performs same

	}

}
