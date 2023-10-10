package lecture_practice;

public class SingletonExam {
	public static void main(String[] args) {

//	Singleton s= new Singleton();  생성자가 private라 못씀 
		Singleton s = Singleton.getInstance(); // 가져온 인스턴스를 변수에 담아야 사용 가능

		System.out.println(s.apple);
	}
}
