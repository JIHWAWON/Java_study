package ex05;

import java.util.ArrayList;
import java.util.List;

class Student1 {

	private String name;
	private int java;

	public Student1(String name, int java) { //생성자, 초기화
		this.name = name;
		this.java = java;
	}

	public int getJava() { //자바 성적 반환
		return java;
	}
}

public class StudentStream {
	public static void main(String[] args) {

		List<Student1> stu = new ArrayList<Student1>();

		stu.add(new Student1("가", 90));
		stu.add(new Student1("나", 33));
		stu.add(new Student1("다", 77));

		double avg = stu.stream().mapToInt(s -> s.getJava()).average().getAsDouble();
                                  //자바성적 추출, 정수형 스트림으로 매핑. 평균값. 평균값을 실수로 
		System.out.printf("평균 : %.2f\n", avg);
	}
}
