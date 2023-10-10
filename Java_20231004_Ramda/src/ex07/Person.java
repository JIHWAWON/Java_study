package ex07;

public class Person {

	public void action(Calcu calcu) { //멤버메서드
		double result = calcu.cal(10, 4);
		System.out.println("result : " + result);
	}

}
