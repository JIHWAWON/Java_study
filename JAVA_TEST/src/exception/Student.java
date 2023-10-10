package exception;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Student {

	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
	private int sum = 0;
	private int avg = 0;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
				+ sum + ", avg=" + avg + "]";
	}

	
	
}