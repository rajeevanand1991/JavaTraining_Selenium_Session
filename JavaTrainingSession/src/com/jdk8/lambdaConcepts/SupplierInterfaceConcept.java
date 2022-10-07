package com.jdk8.lambdaConcepts;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		getText(() -> "java");
		getText(() -> "Rajeev");
		getText(() -> "Test Automation");

	}
	
	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
	}

}
