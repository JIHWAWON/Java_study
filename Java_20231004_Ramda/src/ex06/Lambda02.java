package ex06; //람다 = 함수를 익명으로 정의하는 방법, 코드를 더 간결하고 가독성 있게 (int a, int b) -> a + b

//람다식 : 주로 함수형 인터페이스를 구현, 함수형 인터페이스는 하나의 추상 메서드

interface Printable2 {
	void print(String msg);
}

public class Lambda02 {
	public static void main(String[] args) {
		Printable2 prn = new Printable2() {  //인터페이스를 구현하는 익명 내부 클래스를 사용하여 Printable2 객체를 생성
			@Override
			public void print(String msg) { //print 메서드를 오버라이드하여 메시지를 출력
				System.out.println(msg);
			}
		};
		prn.print("msg print2");

	}
}
//람다 표현식을 사용하면 코드가 더 간결해지며, 두 번째 코드에서처럼 익명 내부 클래스를 직접 구현할 필요가 없습니다