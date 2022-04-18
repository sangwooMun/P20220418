package co.edu.abstracts;

public abstract class Animal {
	// Animal() 생성자로 인스턴스 생성 못하도록 한다.
	
	public Animal() {
		
	}
	
	public abstract void eat(); // 강제로 eat()이라는 메소드를 하위클레스에서 구현하겠다는 의미
	
	public abstract void run();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
}
