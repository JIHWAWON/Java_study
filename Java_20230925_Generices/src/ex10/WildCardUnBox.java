package ex10;

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
	public static void outBox(Box<? extends Toy> box) { // 와일드 카드의 상한제한 = Toy(최대) 타입 & 하위 타입
		Toy t = box.get();
		System.out.println(t);
		box.set(new Toy()); // box 객체의 클래스가 Toy 클래스의 상위 클래스가 아니므로 Toy 클래스의 객체를 저장할 수 없습니다
	}

	public static void inbox(Box<? super Toy> box, Toy n) { // 하한제한 = Toy(최소) 타입 & 상위 타입
		Toy n2 = box.get(); // box 객체의 클래스(object)가 Toy 클래스보다 상위 클래스이기 때문에 직접 형변환해줘야함
		box.set(n);
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
