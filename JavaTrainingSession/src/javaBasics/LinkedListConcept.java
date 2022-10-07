package javaBasics;

import java.util.LinkedList;

import io.netty.util.internal.SystemPropertyUtil;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(2);
		ll.add(4);
		ll.add(6);
		System.out.println(ll);
		ll.addFirst(8);
		System.out.println(ll);
		ll.addLast(10);
		System.out.println(ll);
		System.out.println("Linkedlist values to get ===> "+ll.get(0));
		
		ll.set(0, 24); //it will update value fom 8 to 24
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}
}
