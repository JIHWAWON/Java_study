//제네릭타입 = 클래스나 메서드를 정의할 때 타입(데이터 유형)을 매개변수화할 수 있는 기능
package ex02;

class Box<T> { // T=제네릭타입 매개변수(어떤 유형의 객체도 저장가능)
	private T obj; // 제네릭 타입 T로 이루어진 obj 변수(상자에 저장된 객체)를 선언

	public void set(T obj) { // 저장
		this.obj = obj;
	}

	public T get() { // 반환
		return this.obj;
	}
}
//============================================================================================

class BoxFactory { // 상자를 생성하는 팩토리 클래스
	public static <T> Box<T> makeBox(T o) { // 제네릭 타입 T로 이루어진 상자를 생성하는 정적 메서드(반환타입 Box<T>)
		Box<T> box = new Box();
		box.set(o); // 매개변수로 전달된 객체 o를 상자에 저장하고 해당 상자를 반환
		return box;
	}
}

//============================================================================================

public class Generices02 {
	public static void main(String[] args) {

		Box<String> stringBox = BoxFactory.<String>makeBox("Sweet"); // 문자열을 저장하는 상자(Box<String>)를 생성, "Sweet" 문자열을 상자에 저장

		String message = stringBox.get(); // 상자에서 값을 꺼내어 message 변수에 저장
		System.out.println(message);
	}
}
