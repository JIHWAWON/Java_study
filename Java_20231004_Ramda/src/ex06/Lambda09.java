package ex06;

import java.util.function.Supplier; // Supplier = 매개변수 없이 어떤 값을 제공, 계산이 복잡한 연산 ex)무작위로 생성된 숫자

public class Lambda09 {
	public static void main(String[] args) {

		Supplier<Integer> s1 = () -> (int) (Math.random() * 6); // 인자 없이 값을 제공

		System.out.println(s1.get());
//===================================================================

		Supplier<Integer> s2 = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return (int) (Math.random() * 6);
			}
		};
		System.out.println(s2.get());
	}
}
