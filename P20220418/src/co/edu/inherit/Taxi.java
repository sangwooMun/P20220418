package co.edu.inherit;

public class Taxi extends Car{
	
	// 부모클레스를 상속받음
	// 필드
	String type; // 개인택시, 회사택시
	
	// 생성자
	public Taxi() {
		System.out.println("Taxi() 생성자 호출");
	}
	
	// 메소드
	public void metering() {
		System.out.println("요금 계기판");
	}

	@Override
	public void drive() {
		System.out.println("택시가 운행을 합니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "택시의 종류는 " + type;
	}
	

}
