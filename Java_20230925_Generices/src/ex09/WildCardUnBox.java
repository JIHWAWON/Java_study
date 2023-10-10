package ex09;

class Box<T> {
	private T obj;

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

class Unboxer {

	public static void peekBox(Box<? super Integer> box) {  // 하한제한(최소가 integer, 그 위로 가능)
		System.out.println(box);
	}

} 

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box();
		iBox.set(9999);
		Box<Number> nBox = new Box();
		nBox.set(10.3);
		Box<Object> oBox = new Box();
		oBox.set(9999);

		System.out.println(iBox);
		System.out.println(nBox);
		System.out.println(oBox);

	}
}
