package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {
		// Requirement: list of customer objects
		
		List<Customer> customersList= Arrays.asList(
				new Customer("Rajeev", 31),
				new Customer("Steve", 34),
				new Customer("Abhirami", 27),
				new Customer("Thompson", 23)
				);
		
		 Customer customer=customersList.stream() // convert List to Stream
				 			.filter(x -> "Abhirami".equals(x.getName())) // Filter it for Abhirami only
				 			.findAny() //If it find then return that value
				 			.orElse(null); //If not find then return null
		 System.out.println(customer.getName() + " " + customer.getAge());

		 Customer customer1=customersList.stream() // convert List to Stream
		 			.filter(x -> "JAcky".equals(x.getName())) // Filter it for Jacky only
		 			.findAny() //If it find then return that value
		 			.orElse(null); //If not find then return null
		 System.out.println(customer1);
		 
		 //filter with multiple conditions
		 Customer customer2 = customersList.stream()
		 			.filter((x) -> "Thompson".equals(x.getName()) && 23 == x.getAge()) //Filter it for Thompson and age 23 is primitive datatype so we use == operator for comparing age
		 			.findAny()
		 			.orElse(null); 
		 System.out.println(customer2.getName() + " " + customer2.getAge());
	}

}
