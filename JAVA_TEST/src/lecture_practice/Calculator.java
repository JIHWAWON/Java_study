package lecture_practice;

public class Calculator {

	int result1; //인스턴스변수
	static int result2; //정적변수(클래스 변수)

	void add(int a, int b) { //인스턴스 메서드
		result1 = a + b;
//		this.result = a + b; (O)

	}

	static void sub(int a, int b) { //정적메서드, 클래스메서드 
		result2 = a - b;
//		this.minus = a - b; (X)

	}

}
