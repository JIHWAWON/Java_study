package ex01; //중첩정적클래스 = 외부 클래스의 정적 멤버에만 접근 가능
//클래스내부에 다른 클래스를 정의하는 방법 중 하나. 
//다른 내부클래스와는 다르게, 바깥 클래스의 인스턴스와 관련없이 독립적으로 사용. 내부 클래스 중 가장 외부와 독립적으로 동작.
//정적중첩클래스를 선언 = static, 바깥 클래스의 멤버변수나 메서드에 직접 접근
//외부 클래스의 정적 멤버로 선언되는 클래스입니다.
//외부 클래스의 인스턴스와 무관하게 독립적으로 생성됩니다.
//다른 클래스에서도 접근할 수 있습니다.
class Outer { // 외부클래스, Nested1과 Nested2라는 두개의 정적중첩클래스 가지고 있음

	private static int num = 0;

	static class Nested1 {  //정적중첩클래스
		void add(int n) {
			num += n; // num변수는 Outer클래스의 정적변수이므로, 모든 Nested1 인스턴스가 동일한 num 변수를 공유
		}
	}
	static class Nested2 {
		int get() {
			return num;
		}
	}
}
//==================================================================

public class StaticNestedClass {
	public static void main(String[] args) {
		Outer.Nested1 n1 = new Outer.Nested1();
		Outer.Nested2 n2 = new Outer.Nested2();

		n1.add(5);
		int result = n2.get();
		System.out.println("Result: " + result); 
	}
}
