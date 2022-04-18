package co.edu.inherit;

class Driver {
	public void drive(Car car) {
		car.drive();
	}
}


public class PolyExample {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(taxi);
		driver.drive(bus);
	}

}
