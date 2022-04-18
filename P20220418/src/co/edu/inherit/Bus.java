package co.edu.inherit;

public class Bus  extends Car{
	
	// 필드
	String busNo;
	
	// 생성자
	public Bus() {
		super(); // 부모와 자식 관계에서 super = 부모
		System.out.println("Bus() 생성자 호출");
	}
	
	// 메소드
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	@Override // <= 오버라이딩이라는것을 알려줄떄
	public void drive() {
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model = " +super.model + "]";
//		return super.toString();	// 부모 클레스
	}
	
	
}
