package ex06;

import java.util.*;

//===============================================
class Num {
	private int num;

	public Num(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
//		return String.valueOf(num) ;  //정수를 문자열로(객체의 문자열 표현)
//		return Integer.toString(num);
//		return String.format("%d", num);
		return "" + num;
	}

	public int hashCode() {
		System.out.println("hash=>");
		return num % 3; // 객체의 해시 코드를 계산
	}

	public boolean equals(Object obj) {
		System.out.println("equals=>");

//		if(num==((Num)obj).num)  // 객체 간의 동등성 비교
//			return true; 
//		else 
//			return false;

		return num == ((Num) obj).num ? true : false;
	}
}
//===============================================

public class VectorExam {
	public static void main(String[] args) {  //HashSet에 중복을 허용하지 않는 Num 객체를 저장하고, Iterator를 사용하여 저장된 객체를 출력
		Set<Num> set = new HashSet<>();  //Num 객체를 저장할 HashSet을 생성
		set.add(new Num(9));  //HashSet에 Num 객체를 추가, 중복된 요소를 추가해도 한 번만 저장
		set.add(new Num(12));
		set.add(new Num(7));
		set.add(new Num(9));

		Iterator<Num> itr = set.iterator();  // HashSet의 Iterator 생성, Iterator를 사용하여 Set의 요소를 순회 가능

		while (itr.hasNext()) {  // Iterator로 Set을 순회
			System.out.println(itr.next()); // 현재 요소를 출력
		}
	}
}