package ex07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.AllArgsConstructor;
@AllArgsConstructor

class Person {
	
	private String name;
	private int age;

	@Override
	public int hashCode() { // hashCode() equals() 재정의 -> 동일한 내용의 Person 객체를 같은 것으로
		return ((name.hashCode()) + age % 10) / 2;
	}

	@Override
	public boolean equals(Object obj) { // 이름과 나이가 모두 일치할 때만 true
		String _name = ((Person) obj).name;
		int _age = ((Person) obj).age;
		return name.equals(_name) && age == _age ? true : false;
	}

	@Override
	public String toString() {
		return name + " ( " + age + " ) ";
	}
}

public class SetCollectionExam01 {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>(); // HashSet= 중복x

		set.add(new Person("김민철", 31));
		set.add(new Person("뽀뽀", 11));
		set.add(new Person("지화원", 31));
		set.add(new Person("삐삐", 12));
		set.add(new Person("김동구", 3));
		set.add(new Person("김동구", 3));
		set.add(new Person("뽀뽀", 11));
		set.add(new Person("김민철", 31));
		set.add(new Person("삐삐", 12));
		set.add(new Person("지화원", 31));
		set.add(new Person("김민철", 31));
		set.add(new Person("김동구", 1));
		set.add(new Person("뽀뽀", 11));
		set.add(new Person("삐삐", 12));
		set.add(new Person("김동구", 3));

		Iterator<Person> iter = set.iterator(); // set 컬렉션을 순회
		System.out.println("====while문====");
		while (iter.hasNext()) { // 다음 요소가 있는지
			System.out.println(iter.next()); // 다음 요소를 가져오기
		}
		System.out.println("====for문====");
		for (Person s : set) {
			System.out.println(s);
		}

	}
}