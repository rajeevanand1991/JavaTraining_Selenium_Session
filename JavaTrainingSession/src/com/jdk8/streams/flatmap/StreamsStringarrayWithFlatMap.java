package com.jdk8.streams.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringarrayWithFlatMap {

	public static void main(String[] args) {
		String data[][] = new String[][] {
			{"a","b"},
			{"c","d"},
			{"e","f"},
		};
		
		//convert to stream
		Stream<String[]> dataStream = Arrays.stream(data); 
		//apply flatmap on data stream
		Stream<String> streamFlatMap = dataStream.flatMap(x -> Arrays.stream(x));
		Stream<String> dataStreamFilter = streamFlatMap.filter(x -> "a".equals(x.toString()));
		dataStreamFilter.forEach(System.out::println);
		
		//Same logic in 2 lines
		Stream<String> finalStream = Arrays.stream(data)
				.flatMap(x -> Arrays.stream(x))
				.filter(x -> "d".equals(x.toString()));
		finalStream.forEach(System.out::println);
	}

}
