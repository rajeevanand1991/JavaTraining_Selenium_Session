package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("Macbook", "Dell Laptops", "HP Laptops", "Iphones", "Shoes","Battery Charger","Bat");
		System.out.println(productList);
		productList.forEach(ele -> System.out.println(ele));
		
		List<String> result = productList.stream().filter(ele -> !ele.equals("Shoes")).collect(Collectors.toList());
		result.forEach(ele -> System.out.println(ele));
		result.forEach(System.out::println);

	}

}
