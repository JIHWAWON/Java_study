package ex06;

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
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}

	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

public class Generices06 {
	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		box.set("So simple String");
		Unboxer.peekBox(box);
		String str = Unboxer.openBox(box);
		System.out.println("openBox : " + str);
	}

}
