package co.edu.nested;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		
		
		// 인스턴스 멤버클래스 instance
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();
		
		// instance = new로 생성해야한다 vs static 바로 사용 할 수있다.
		
		// 정적 멤버클래스 static
		Outer.Inner2.method5();//outer.new Inner();
		
		// static 클래스의 인스턴스 메소드 호출하기
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4(); // 인스턴스 메소드
		inner2.method5(); // 정적 메소드
		
//		inner.method2();
		
//		Locar locar = new Locar();
	}

}
