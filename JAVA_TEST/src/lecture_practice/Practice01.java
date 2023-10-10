package lecture_practice;

public class Practice01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(250); // 120 출력
		p.info();

		p.age = 500;
		p.info();
	}
}

class Person {
	String name;
	int age; // private로 써줘야 위에서 p.age=500;으로 직접 값 지정x

	public void setAge(int age) {
		if (age > 120)
			this.age = 120;
		else
			this.age = age;
	}

	public void info() {
		System.out.println("age: " + age);
	}
}
