package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //BMW -- start
		b.stop(); //Car -- stop
		b.fillFuel(); //Car -- fill fuel
		b.autoParking(); //BMW -- auto parking
		b.engine(); //vehicle --  engine
		
		Car c = new Car();
		c.start(); //Car -- start
		c.stop(); //Car -- stop
		c.fillFuel(); //Car -- fill fuel
		c.engine(); //vehicle --  engine
		
		//Top Casting Allowed (Runtime Polymorphism)
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable
		c1.start(); //BMW -- start
		c1.stop(); //Car -- stop
		c1.fillFuel(); //Car -- fill fuel
		c1.engine(); //vehicle --  engine
		
		Vehicle v1 = new BMW(); //grand child class object can be referred by grand parent class reference variable
		v1.engine(); //vehicle --  engine
		
		//Down Casting Not Allowed
		BMW b1 =  (BMW) new Car(); //ClassCastException
	}
}