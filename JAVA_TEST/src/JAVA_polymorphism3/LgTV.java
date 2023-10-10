package JAVA_polymorphism3;

public class LgTV extends TV{
	
	public void powerOn() {
		System.out.println("LgTv 전원을 킨다.");
	}

	public void powerOff() {
		System.out.println("LgTv 전원을 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTv 볼륨을 올린다.");
	}

	public void volumeDown() {
		System.out.println("LgTv 볼륨을 내린다.");
	}
}
