package package01;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object a) {
		Person b = (Person) a;
		return this.name.equals(b.name) && this.age == b.age;
	}
}
