package ex05;

public class Car {
	private Tire tire1 = new Tire();   //객체생성
	
	private Tire tire2 = new Tire() {  //익명내부클래스를 사용하여 객체생성
		public void roll() {
			System.out.println("익명1 타이어 굴러가....");
		};
	};

	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	public void run2() {
		Tire tire = new Tire() {  //익명 내부 클래스를 사용하여 Tire 객체를 생성하여 tire 변수에 할당
			public void roll() {
				System.out.println("익명2 타이어 굴러가....");
			}
		};
	}
	public void run3(Tire tire) {
		tire.roll();
	}
}
