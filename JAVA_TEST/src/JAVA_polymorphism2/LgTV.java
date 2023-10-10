package JAVA_polymorphism2;

public class LgTV extends SamsungTV{
	
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
