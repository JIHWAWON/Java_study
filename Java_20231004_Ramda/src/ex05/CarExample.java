package ex05;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		car.run1();
		car.run2();
		car.run3(new Tire() {
			public void roll() {  //익명 내부 클래스를 사용하여 새로운 Tire 객체를 생성
				System.out.println("익명3 타이어 굴러가....");
			}
		});
	}
}
