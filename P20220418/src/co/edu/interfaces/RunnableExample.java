package co.edu.interfaces;

// 구현클래스 클래스명
interface Runnable {
	public void run();
}

class RunClass implements Runnable {
	@Override
	public void run() {
		System.out.println("움직입니다.");
	}

}

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();

		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("멈뭄미가 달림미다.");
			} // 익명구현객체

		};
		runnable.run();

		// 익명구현객체, 람다표현식
		runnable = () -> System.out.println("고먐미가 달림미다.");
		runnable.run();

	}
}
