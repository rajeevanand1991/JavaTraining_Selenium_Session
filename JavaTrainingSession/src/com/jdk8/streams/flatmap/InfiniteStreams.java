package com.jdk8.streams.flatmap;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		// Infinite Streams are used to generate infinite stream of data
		// 1. we can achieve it by iterate()
		//syntax: static iterate(T seed, Unaryoperator<T> f)
		//Return type is stream --> Stream<T>
		
		List<Integer> collect = IntStream.iterate(0, x -> x+2)
								.mapToObj(Integer::valueOf)
								.limit(10)
								.collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		//2. Another method also we have, which is generate()
		//syntax: static generate(Supplier<T> s)
		
		List<Integer> collect2= Stream.generate(() -> (new Random().nextInt(100)))
									.limit(10)
									.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
