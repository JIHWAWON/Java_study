package ex08;

class Box<T> {
	private T obj; // 제네릭 타입 T로 선언된 멤버 변수 obj

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return this.obj;
	}

	public String toString() { // 해당 객체를 문자열로 표현
		return obj.toString();
	}
}

//==========================================================
class Toy {
	public String toString() { // toString() 메서드를 오버라이딩
		return "좡난괌";
	}
}

class BoxHandler {
	public static void outBox(Box<Toy> box) { // outBox메서드의 매개변수 : Box<Toy> 타입의 상자(box)
		Toy t = box.get(); // 상자(box)에서 Toy객체를 읽어와서(box.get()) Toy타입의 변수t에 저장
		System.out.println(t);
	}

	public static void inbox(Box<Toy> box, Toy n) { // inbox메서드의 매개변수 : Box<Toy> 타입의 상자(box), Toy 타입의 객체(n)
		box.set(n); // 상자(box)에 Toy객체(n)를 저장
	}
}

//==========================================================
public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Toy> box = new Box(); // 클래스를 제네릭 타입 <Toy>으로 생성한 박스 객체를 만들어 Toy 객체를 저장
		BoxHandler.inbox(box, new Toy()); // 객체를 저장
		BoxHandler.outBox(box); // 꺼내와 출력
	}
}