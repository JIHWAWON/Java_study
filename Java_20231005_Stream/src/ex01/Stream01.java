package ex01;

// Supplier : 값을 생성(매개변수x, 값을 반환)
// Function : 값을 변환(입력값을 받아서 다른 형태의 값으로 반환).
// Consumer : 값을 소비(입력값을 받아서 그 값으로 어떤 작업을 수행하거나 출력,반환값x)
// Filter : 주어진 조건에 따라 요소를 선택하거나 걸러내는 역할(매개변수-Predicate-true/false)
//foreach : 스트림의 각 요소를 반복출력

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream01 {
	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };

		IntStream stm1 = Arrays.stream(ar); // 배열ar을 스트림으로 변환
		IntStream stm2 = stm1.filter(n -> n % 2 == 1); // 홀수만 필터링(1,3,5)

		int sum1 = stm2.sum();
		System.out.println(sum1);

		int result = Arrays.stream(ar).filter(n -> n % 2 == 1).sum();
		System.out.println(result);

		System.out.println("------------------------------------------------");

		String[] ar2 = { "Toy", "Boxx", "Robot", "aa", "bb" };

		Arrays.stream(ar2).filter(s -> s.length() > 3).filter(s -> s.length() % 2 == 1)
				.forEach(s -> System.out.println(s));
		// 문자열 배열을 스트림으로 변환. 스트림의 각 요소에 대한 반복(람다변수->) 각 문자열 요소의 길이를 계산
		System.out.println("------------------------------------------------");

		Arrays.stream(ar2).map(s -> s.length()).forEach(s -> System.out.print(s));
		// map메서드 = (스트림의 각 요소에 대한 변환) 각 문자열의 길이를 반환
		System.out.println("------------------------------------------------");

		int sum2 = Arrays.stream(ar2).mapToInt(s -> s.length()).sum(); // 문자열 길이의 합계
		// mapToInt = 각 문자열의 길이를 - 정수로 변환
		System.out.println(sum2);


	}
}
