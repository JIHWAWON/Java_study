package lecture_practice;

public class BCat extends PCat {
	public String color;

	public BCat(String breed, String color) {
		super(breed);
		this.color = color;

	}

	void meow() {
		System.out.println("야옹");
	}

}
