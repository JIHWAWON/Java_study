package ex02;  

interface Printable { // 인터페이스
	void print(); // 추상메서드(하위클래스에서 구현)
}
//==================================================================

class Papers { // 외부클래스
	private String con; // 문자열 멤버변수

	public Papers(String con) { // 생성자
		this.con = con;
	}

	public Printable getPrinter() { // 중첩 이너 클래스의 인스턴스를 반환
		return new Printer();
	}

	private class Printer implements Printable { // 인터페이스를 구현,getPrinter()는 Printable을 반환

		@Override
		public void print() {
			System.out.println(con);
		}
	}
}
//==================================================================

public class UseMemberInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지를 출력합니다");

		Printable prn = p.getPrinter();
		prn.print();

		// 중첩 이너 클래스를 사용하여 인터페이스를 구현하고, Papers 클래스의 인스턴스를 통해 메시지를 출력
	}
}
