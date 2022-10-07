package com.jdk8.lambdaConcepts;

//SAM - Single Abstract Method

	@FunctionalInterface
	public interface WebPage {
		
		void header(String value, int age);
		//void footer();
	
	}
