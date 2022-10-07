package com.jdk8.streams.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetwithFlatMap {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Rajeev");
		emp1.addDevices("Nokia 6.1 Plus");
		emp1.addDevices("Iphone 14");
		emp1.addDevices("Blackberry 8");
		emp1.addDevices("Samsung S15");
		
		Employee emp2 = new Employee();
		emp2.setName("Spiderman");
		emp2.addDevices("Lenovo windows10");
		emp2.addDevices("Iphone 14");
		emp2.addDevices("Blackberry 10");
		emp2.addDevices("Samsung S16");
		
		List<Employee> empLists = new ArrayList<Employee>();
		empLists.add(emp1);
		empLists.add(emp2);
		
		List<String> devices = empLists.stream() // Convert to Stream
			.map(x -> x.getDevices()) //Stream<Set<String>>
			.flatMap(x -> x.stream()) // Stream<String>
			.distinct() //Common takes one values if it present in one or many
			.collect(Collectors.toList());
		devices.forEach(x -> System.out.println(x));

	}

}
