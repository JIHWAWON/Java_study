package ex05;

class Box<T> {
	private T obj;

	public Box(T obj) {
		this.obj = obj;
	}
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
}
//============================================================================================

class SteelBox<T> extends Box<T> {
	public SteelBox(T obj) {
		super(obj);
	}
}
//============================================================================================

public class Generices05 {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox(new Integer(999));
		Box<String> sBox = new SteelBox(new String("asdf"));
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
}
