package package01;

public class Main {
	public static void main(String[] args) {

		Person p = new Person("홍길동", 20);
		Person pp = new Person("홍길동", 20);

		System.out.println(p.equals(pp));

	} 
}
