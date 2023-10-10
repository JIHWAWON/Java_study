package JAVA_polymorphism3;

public class SamsungTV extends TV{
	
	public void powerOn() {
		System.out.println("삼성 TV 전원을 킨다.");
	}

	public void powerOff() {
		System.out.println("삼성 TV 전원을 끈다.");
	}

	public void volumeUp() {
		System.out.println("삼성Tv 볼륨을 올린다.");
	}

	public void volumeDown() {
		System.out.println("삼성Tv 볼륨을 내린다.");
	}
}
