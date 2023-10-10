package ex06; //람다 = 함수를 익명으로 정의하는 방법, 코드를 더 간결하고 가독성 있게 (int a, int b) -> a + b

//람다식 : 주로 함수형 인터페이스를 구현, 함수형 인터페이스는 하나의 추상 메서드

interface Printable {  //인터페이스
	void print(String msg);
}

class Printer implements Printable {  //인터페이스를 구현하는 Printer 클래스 
	public void print(String msg) {
		System.out.println(msg);
	}
}

public class Lambda01 {
	public static void main(String[] args) {
		Printable prn = new Printer();  //Printer 객체 생성 및 Printable 인터페이스로 참조
		prn.print("msg print");

	}
}
