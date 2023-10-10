package ex02; //멤버이너클래스 = 외부 클래스의 모든 멤버에 접근 가능
//외부 클래스의 멤버로 선언되는 클래스입니다.
//외부 클래스의 인스턴스가 생성되어야만 사용할 수 있습니다.
//외부 클래스의 멤버에 접근할 수 있습니다
//다른 클래스 내부에 정의되며, 해당 클래스의 멤버처럼 동작합니다. 주로 외부 클래스의 인스턴스와 연결되어 사용

class Outer { // 외부클래스
	private int num = 0; // 정수형 멤버변수

	class Member { // 멤버이너클래스
		void add(int n) {
			num += n;
		}

		int get() {
			return num;
		}
	}
}

//==================================================================
class Outer1 {
	private int num = 0;

	class Member {
		void add(int n) {
			num += n;
		}

		int get() {
			return num;
		}
	}
}
//==================================================================

public class MemberInnerClass {

	public static void main(String[] args) {

		Outer o1 = new Outer(); // 객체(인스턴스)생성
		Outer o2 = new Outer();

		Outer.Member m1 = o1.new Member(); // 이너클래스의 객체생성 = o1의 인스턴스를 통해 생성, o1의 멤버변수 num에 접근
		Outer.Member m2 = o1.new Member();

		Outer.Member m3 = o2.new Member();
		Outer.Member m4 = o2.new Member();

		m1.add(5);
		System.out.println(m1.get());
		m2.add(15);
		System.out.println(m2.get());

		m3.add(1);
		System.out.println(m3.get());
		m4.add(15);
		System.out.println(m4.get());

		//멤버 이너 클래스는 외부 클래스의 인스턴스와 밀접하게 연결되며, 외부 클래스의 멤버 변수에 접근
	}

}
