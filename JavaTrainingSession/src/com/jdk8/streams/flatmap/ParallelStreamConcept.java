package com.jdk8.streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		ForkJoinPool corePools = ForkJoinPool.commonPool();
		System.out.println(corePools.getParallelism());
		
		// 1. Parallel () method on Stream
		Stream stream = Stream.of("Rajeev", "Anand", "Tom", "Peter", "Simon");
		//BaseStream parallelStream = stream.parallel();
		Stream.of("Rajeev", "Anand", "Tom", "Peter", "Simon").forEach(System.out::println);
		System.out.println("-------------");
		Stream.of("Rajeev", "Anand", "Tom", "Peter", "Simon").parallel().forEach(System.out::println);
		
		// 2. Use parallelStream() method on a collection stream
		System.out.println("-------------");
		Arrays.asList("Rajeev", "Anand", "Tom", "Peter", "Simon").parallelStream().forEach(System.out::println);
		
		//3. Print 1 to 10
		System.out.println("---------- Normal Sequential Stream -----------");
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("---------- Parallel Stream -----------");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		//4. To print from a - z --> ASCIII value is 97 - 122
		//System.out.println(getAlphabetsList());
		System.out.println("----- Sequential Stream ------");
		getAlphabetsList().stream().forEach(System.out::println);
		System.out.println("----- Parallel Stream ------");
		getAlphabetsList().parallelStream().forEach(System.out::println);
		
		//5. Check stream is running in parallel mode: isParallel() method
		IntStream range = IntStream.rangeClosed(1, 10);
		System.out.println(range.isParallel()); // return false due to execution in sequential stream
		IntStream range1 = IntStream.rangeClosed(1, 10);
		range1.parallel();
		System.out.println(range1.isParallel()); // return true due to execution in parallel stream
		
		
	}
	
		public static List<String> getAlphabetsList() {
			List<String> alpha = new ArrayList<String>();
			int n = 97;
			while(n<=122) {
				char c = (char) n;
				alpha.add(String.valueOf(c)); // convert char to String
				n++;
			}
			return alpha;
			
		}

}