package ex06;

import java.util.function.Predicate; // Predicate = 값을 입력으로 받아서 논리적인 조건을 검사하여 true 또는 false를 반환

public class Lambda11 {
	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				System.out.print(t + ":");
				return t % 2 == 0;
			}
		};

		boolean flag = p.test((int) (Math.random() * 100));
		String result = flag == true ? "짝수" : "홀수";
		System.out.println(result);
		
		// ======================================
		
		Predicate<Integer> pp = t -> t % 2 == 0;

		flag = pp.test((int) (Math.random() * 100));
		result = flag == true ? "짝수" : "홀수";
		System.out.println(result);
	}
}
