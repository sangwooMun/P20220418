package co.edu.inherit;
// Taxi, Bus, Truck
public class Car {
	
	// 공통적인 기능은 부모클레스에
	// 필드
	String model;
	
	// 생성자
	public Car() {
		System.out.println("Car() 생성자 호출");
	}
	
	// 메소드
	public void drive() {
		System.out.println("운행을 합니다.");
	}
}
