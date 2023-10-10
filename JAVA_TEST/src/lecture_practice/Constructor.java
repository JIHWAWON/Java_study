package lecture_practice;

class Car {
	int gasoline;

	Car(int gasoline) {
		this.gasoline = gasoline;
	}
}

class HybridCar extends Car {
	int electric;

	HybridCar(int gasoline, int electric) {
		super(gasoline);
		this.electric = electric;
	}
}

 class HybridWCar extends HybridCar {
	int water;

	HybridWCar(int gasoline, int electric, int a) {
		super(gasoline, electric);
		water = a;
	}

	public void showGauge() {
		System.out.println("잔여가솔린:" + gasoline);
		System.out.println("잔여전기:" + electric);
		System.out.println("잔여워터:" + water);
	}
}

 public class Constructor{
	public static void main(String[] args) {
		HybridWCar car = new HybridWCar(4, 2, 3);
		car.showGauge();

		HybridWCar car2 = new HybridWCar(9, 5, 7);
		car2.showGauge();
	}
}
