package ex03; //로컬이너클래스
//메서드 내부에서 선언되는 클래스로, 메서드가 호출될 때만 생성됩니다.
//메서드 내부의 지역 변수에 접근할 수 있습니다 (단, 해당 변수는 final 또는 effectively final이어야 합니다).
//메서드 외부에서는 접근할 수 없습니다.
//메서드 내부에서만 사용하는 용도로 주로 활용됩니다.
interface Printable { // 인터페이스
	void print();
}
//==================================================================

class Papers { // 외부클래스
	private String con; // private 문자열 멤버변수

	public Papers(String con) { // 생성자를 통해 문자열을 초기화
		this.con = con;
	}

	public Printable getPirnter() {

		class Printer implements Printable { // 로컬이너클래스
			public void print() { // 인터페이스를 구현
				System.out.println(con);
			}
		}
		return new Printer();
	}
}

public class LocalInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메세지 출력");

		Printable prn = p.getPirnter();
		prn.print();
	}
}
