package practice;

public class Main {
	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = (Dog) a;
		a.eat();
		d.eat();
		d.똥개();

		System.out.println("=========================");

	}
}