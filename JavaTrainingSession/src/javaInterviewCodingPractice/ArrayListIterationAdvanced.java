package javaInterviewCodingPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterationAdvanced {

	public static void main(String[] args) {
	
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Add");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//1. Using Java 8 with for each loop and lamda expression
		System.out.println("---------- print using for each with lambda in Java 8 ---------");
		tvSeries.forEach( shows -> {
			System.out.println(shows);
		});
		
		
		System.out.println("----- print using Iterator ---------");
		
		//2. Using Iterator:
		Iterator<String> it= tvSeries.iterator();
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		//3. Using Iterator and Java 8 lambda and forEachRemaining() method
		System.out.println("----- print using Iterator and Java 8 lambda and forEachRemaining() method ---------");
		it=tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		//4. Using For Each loop normal way
		System.out.println("----- print using For Each loop ---------");
		for(String show : tvSeries) {
			System.out.println(show);
		}
		
		//5. Using for loop with Index/order:
		System.out.println("----- print using for loop with Index/order: ---------");
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//6. Using ListIterator() to in both the directions - Forward or Reverse
		System.out.println("----- print using ListIterator() to in both the directions - Forward or Reverse ---------");
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
			
		}
	}

}
