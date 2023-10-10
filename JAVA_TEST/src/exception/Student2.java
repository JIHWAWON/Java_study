package exception;

public class Student2 {
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
	private int sum = 0;
	private int avg = 0;
	
	
	public int sum() {
		return kor+eng+math;
	}
	
	public int avg() {
		return kor+eng+math/3;
	}
	public Student2(String name, int age, int kor, int eng, int math) {
		super();
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
	}
,
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
				+ sum + ", avg=" + avg + "]";
	}

	
	
}
}
