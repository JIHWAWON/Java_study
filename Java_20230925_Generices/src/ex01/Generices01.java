// 제네릭스 = 다양한 유형의 데이터를 동일한 코드로 처리, 형변환X
//          "어떤 유형의 데이터든지 받아들일 수 있는 컨테이너"
package ex01;

class Apple {
	public String toString() {
		return "I am an Apple";
	}
}

class Orange extends Apple {
	public String toString() {
		return "I am an Orange";
	}
}

class Box<T extends Number> { // 제한두기 ex)number(정수 꼭대기)ㅡ 하위에는 long Integer등이 있음
	private T obj;

	void setObj(T obj) {
		this.obj = obj;
	}

	T getObj() {
		return obj;
	}
}

//===================================================
public class Generices01 {
	public static void main(String[] args) {

		Box<Number> aa = new Box();
		Box<Integer> bb = new Box();
		Box<Double> cc = new Box();

	}
}