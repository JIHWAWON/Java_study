package ex04;

class Box<T> { 
	
	private T obj;
	public void set(T obj) { 
		this.obj = obj;
	}

	public T get() { 
		return this.obj;
	}
}
//============================================================================================
class BoxFactory { 
	public static <T> Box<T> makeBox(T o) { 
		Box<T> box = new Box();
		box.set(o); 
		return box;
	}
}
class Unboxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println(box.get().intValue());
		return box.get();
	}
} 
// ============================================================================================

public class Generices04 {
	public static void main(String[] args) {
		Box<Integer> sBox = BoxFactory.makeBox(889);
		int n = Unboxer.openBox(sBox);
		System.out.println(n);
	}
}