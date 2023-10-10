package ex11.copy;

class Box<T> {
	private T obj; // 제네릭 타입 T로 선언된 멤버 변수 obj

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return this.obj;
	}

	public String toString() {
		return obj.toString();
	}
}

//==========================================================
class Toy {
	public String toString() { // toString() 메서드를 오버라이딩
		return "좡난괌";
	}

	class BoxContentMover { // to > Toy > from
		public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) { // to = Toy 클래스나 그 상위 클래스, from =Toy
																					// 클래스나 그 위 클래스

			to.set(from.get()); // from(하위) 상자의 내용을 to(상위) 상자로 이동시키는 것은 가능
			from.set(to.get());
		}
	}

//==========================================================
	public class WildCardUnBox {
		public static void main(String[] args) {
			Box<Toy> box1 = new Box<>();
			box1.set(new Toy());

			Box<Toy> box2 = new Box<>();
			BoxContentMover.moveBox(box1, box2); // box1에 저장된 Toy 객체를 box2로 이동
			System.out.println(box2.get());
		}
	}
}
