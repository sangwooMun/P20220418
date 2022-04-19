package co.edu.interfaces;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("오디오를 킵니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	@Override
	public void volumeUp() {
		System.out.println("오디오의 볼륨을 올립니다.");
	}
	@Override
	public void volumeDown() {
		System.out.println("오디오의 볼륨을 내립니다.");
	}
	
	
}
