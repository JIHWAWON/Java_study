package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lombok.AllArgsConstructor;

//===============================================
@AllArgsConstructor // 롬복에서 생성자를 자동으로 생성해주는 애너테이션
class Car {
	private String model;
	private String color;

	@Override
	public int hashCode() {
		return (model.hashCode() + color.hashCode()) / 2; // model과 color 필드의 해시 코드를 가져와서 더한 후 평균값을 반환
	}

	@Override
	public boolean equals(Object obj) { // 두 개의 Car 객체가 완전히 동일한 객체일 때에만 true
		String _model = ((Car) obj).model;
		String _color = ((Car) obj).color;

		if (model.equals(_model) && color.equals(_color));
		return super.equals(obj);
	}

	@Override
	public String toString() { // Car 객체를 문자열로 표현
		return model + ": " + color;
	}
}
//===============================================

public class VectorExam {
	public static void main(String[] args) {
		Set<Car> set = new HashSet<Car>(); // Car 객체를 저장하기 위한 HashSet 생성

		set.add(new Car("소나타", "흰색")); // Car 객체를 HashSet에 추가
		set.add(new Car("그랜저", "검정"));
		set.add(new Car("소나타", "검정"));
		set.add(new Car("제네시스", "흰색"));
		set.add(new Car("제네시스", "검정"));
		set.add(new Car("소나타", "검정"));

		Iterator<Car> itr = set.iterator(); // HashSet을 순회하기 위한 Iterator 생성

		while (itr.hasNext()) { // Iterator를 사용하여 HashSet의 객체를 출력

			Car c = itr.next();
			System.out.println(c.toString());
		}
	}

}
