package com.jdk8.streams.flatmap;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {
		//1.
		Stream stream = Stream.of("Rajeev", "Anand", "Tom", "Peter");
		//stream.forEach(System.out::println); //here we worked stream and its closed now
		stream.findFirst().ifPresent(System.out::println);
		
		//2.
		Arrays.asList("a1","a2","a3")
			.stream()
			.findFirst()
			.ifPresent(System.out::println);
		
		//3. range: 1 to 5
		IntStream.range(1, 5).forEach(System.out::println);
		
		//4.
		Arrays.stream(new int[] {1,2,3,4,5})
			.map(x -> 2*x+1)
			.average()
			.ifPresent(System.out::println);
		
		//5. String data objects
		Stream.of("a1", "a2", "a3")
			.map(x -> x.substring(1))
			.mapToInt(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);
		
		//6. Double value to String objects
		Stream.of(1.0,2.0,3.0)
			.mapToInt(Double::intValue) //convert double value to int
			.mapToObj(x -> "a" + x) 
			.forEach(System.out::println);
		
		//7. Limit
		Stream.iterate(0, x -> x+1).limit(10).forEach(System.out::println);
		
		//8. odd number to print upto 10
		Stream.iterate(0, x-> x+1).filter(x -> x%2 !=0).limit(10).forEach(System.out::println);
	}

}
