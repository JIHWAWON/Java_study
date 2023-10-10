package ex14;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person implements Comparable {

	private String name;
	private int age;

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	@Override
	// Arrays.sort로는 정렬이 되지않기 떄문에 클래스에 Comparable인터페이스를 상속받고
	// 비교할 수 있게 메서드를 작성해주고 오버라이딩으로 덮어씌워준다.
	public int compareTo(Object o) {
		Person p = (Person) o;
		if (this.age > p.age)
			return 1;
		else if (this.age < p.age)
			return -1;
		else
			return 0;
	}
}

public class OtherExam2 {

	public static void main(String[] args) {

		Person[] person = { new Person("조조", 40), new Person("유비", 30), new Person("관우", 35) };

		Arrays.sort(person); // 정렬되지 않음 패키지 ex15에서 확인
		for (Person p : person) {
			System.out.println(p);
		}

	}
}