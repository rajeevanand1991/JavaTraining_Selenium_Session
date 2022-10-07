package inheritance;

public class Car extends Vehicle{
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void fillFuel() {
		System.out.println("Car -- fill fuel");
	}
}