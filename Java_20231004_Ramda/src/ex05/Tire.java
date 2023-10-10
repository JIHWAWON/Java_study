package ex05;

public class Tire {
	public void roll() {
		System.out.println("일반 타이어 굴러감...");
	}
}

class SubTire extends Tire {
	public void roll() {
		System.out.println("익명1 타이어 굴러가....");
	}
}
