package ex06; 

interface Printable3 {
	void print(String msg);
}

public class Lambda03 {
	public static void main(String[] args) {
		Printable3 prn = //인터페이스를 구현한 객체를 참조하는 prn 변수를 선언
				(msg) -> {  //String  msg라는 하나의 인자를 받고, 중괄호 {} 내에서 해당 메시지를 출력하는 코드 블록을 정의
					System.out.println(msg);
				};

		prn.print("msg print3");

	}
}
