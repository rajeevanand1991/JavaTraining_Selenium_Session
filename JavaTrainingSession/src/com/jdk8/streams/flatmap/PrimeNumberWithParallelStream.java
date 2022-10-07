package com.jdk8.streams.flatmap;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		//System.out.println(isPrime(3));
		long t1,t2;
		t1 = System.currentTimeMillis();
		long count = Stream.iterate(0, x -> x+1)
						.limit(10)
						//.parallel() //This will act as like parallel stream now
						.filter(PrimeNumberWithParallelStream::isPrime)
						.peek(x -> System.out.println(x))
						.count();
		System.out.println("Total Prime Numbers: "+count);
		t2 = System.currentTimeMillis();
		System.out.println("Total Time Taken = " +(t2-t1)/1000);
	}
	
	public static boolean isPrime(int number) {
		if(number<1) return false;
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number % x == 0);
		
	}

}
