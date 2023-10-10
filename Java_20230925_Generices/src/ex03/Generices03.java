//제네릭타입 = 클래스나 메서드를 정의할 때 타입(데이터 유형)을 매개변수화할 수 있는 기능
package ex03;

class Box<T> { // 제네릭 타입 T를 사용한 Box 클래스 생성
	private T obj; // 제네릭 타입 T로 이루어진 obj 변수(상자에 저장된 객체)를 선언

	public void set(T obj) { // 객체 저장
		this.obj = obj;
	}

	public T get() { // 객체 반환
		return this.obj;
	}
}
//============================================================================================

class Unboxer { // 상자를 열어주는(Unboxer)클래스
	public static <T> T openBox(Box<T> box) { // Box<T> 타입의 상자를 받아서 상자 안에 저장된 객체를 반환(반환타입 T)
		return box.get();
	}
}
//============================================================================================

public class Generices03 {
	public static void main(String[] args) {

//		Box<String> stringBox = Unboxer.openBox("Sweet");  (x) Box<String>을 먼저 생성하고 그 상자를 Unboxer.openBox() 메서드에 전달

		Box<String> stringBox = new Box<String>();
		stringBox.set("Sweedt");
		
		String message = Unboxer.openBox(stringBox); // 상자에서 값을 꺼내어 message 변수에 저장

		System.out.println(message);
	}
}
