package ex04; //익명클래스
//이름 없이 정의되는 클래스로, 주로 인터페이스 또는 추상 클래스의 인스턴스를 생성하기 위해 사용됩니다.
//클래스 정의와 동시에 객체를 생성하며, 클래스 이름이 없습니다.
//코드 블록 내에서 메서드를 구현하거나 오버라이드할 수 있습니다.
//주로 간단한 임시 작업을 위해 사용됩니다.
interface Printable { // 인터페이스
	void print(); // 추상메서드
}
//==================================================================

class Papers { // 외부클래스
	private String con; // private 문자열 멤버변수

	public Papers(String con) { // 생성자를 통해 문자열 초기화
		this.con = con;
	}

	public Printable getPirnter() { // Printable을 반환하는 메서드 정의
		return new Printable() { // 익명내부클래스를 생성하여 Printable 인터페이스를 구현
			@Override
			public void print() {
				System.out.println(con);
			}
		};
	}
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메세지 출력"); // Papers 객체 생성 및 문자열 초기화

		Printable prn = p.getPirnter();
		prn.print();
	}
}
