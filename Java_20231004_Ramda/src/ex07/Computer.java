package ex07;

public class Computer {
	
	public static double staticMethod(double x, double y) {// 정적변수(클래스::메소드) 인스턴스를 생성하지 않고도 호출
		return x + y;
	}
	public double instanceMethod(double x, double y) {  //인스턴스변수(참조변수::메소드) 객체를 생성해야 메소드 호출
		return x + y;

	}
}
