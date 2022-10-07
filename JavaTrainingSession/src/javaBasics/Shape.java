package javaBasics;

public abstract class Shape {
	
	int color=1;
	
	public abstract void drawing();
	
	public void fill() {
		System.out.println("Shape -- Fill");
	}

}
