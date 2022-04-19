package co.edu.interfaces;

// 인터페이스를 상속이 아닌 구현하는 클래스를 통해서 구현된다.
public class Television implements RemoteControl{

	
	
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
	}
	@Override
	public void volumeUp() {
		System.out.println("티비의 볼륨을 올립니다.");
	}
	@Override
	public void volumeDown() {
		System.out.println("티비의 볼륨을 내립니다.");
	}
	@Override
	public void adjustScreen() {
//		RemoteControl.super.adjustScreen();
		System.out.println("티비의 화면을 조정합니다.");
	}
	
	
	
}
