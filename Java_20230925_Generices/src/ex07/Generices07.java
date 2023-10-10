package ex07;

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

	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

public class Generices07 {
	public static void main(String[] args) {

		Box<Integer> box = new Box<>();
		box.set(1234);
		Unboxer.peekBox(box);
		
		Box<Double> box2 = new Box<>();
		box2.set(12.34);
		Unboxer.peekBox(box2);
	}
}
