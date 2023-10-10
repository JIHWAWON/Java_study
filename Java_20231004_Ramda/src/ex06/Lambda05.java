package ex06;

@FunctionalInterface  //인터페이스에 추상메서드1개다, 나는 람다 쓰겠다 

interface Cal2 {
	int max(int num1, int num2);  //추상메서드 
}

public class Lambda05 {
	public static void main(String[] args) {
		Cal2 cal =   //람다식 쓰려먼 인터페이스에 추상메서드가 1개여야함 
				(num1, num2) -> num1 > num2 ? num1 : num2;

		int result = cal.max(15, 10);
		System.out.println(result);
	}
}
