package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce01 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // 정수형 리스트(numbers)를 생성, 초기값 1,2,3,4,5
		Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
		// 정수형 리스트를 스트림으로 변환.스트림의 요소를 하나로 줄이는 연산. 첫번째 매개변수 0은 초기값, 람다
		// 0+1=1 +2=3 +3=6 +4=10 +5=15
		System.out.println("sum : " + sum);

		System.out.println("-------------------------------------------------------------");

		List<String> str = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee");
		Integer totalL = str.stream().map(s -> s.length()).reduce(0, (a, b) -> a + b);
		// 문자열 리스트를 스트림으로 변환.map다른 문자열 길이로 변환. 스트림의 요소를 하나로 줄이는 연산. 첫번째 매개변수 0은 초기값, 람다
		// 0+1=1 +2=3 +3=6 +4=10 +5=15
		System.out.println(totalL);

		System.out.println("-------------------------------------------------------------");

		List<Integer> num = new ArrayList<Integer>(); // num이라는 이름의 ArrayList를 생성(정수 저장)
		for (int i = 0; i < 10; i++) { // 0~9
			num.add((int) (Math.random() * 100)); // 0이상 1미만의 난수x100
		}
		for (Integer i : num) // num 리스트에 저장된 값을 모두 출력
			System.out.print(i + " ");
		System.out.println();

		Integer max = num.stream().reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
		// num 리스트를 스트림으로 변환, reduce 사용하여 최댓값을 찾기. Integer.MIN_VALUE는 초기값
		System.out.println("max : " + max);

		System.out.println("-------------------------------------------------------------");

		List<String> str2 = Arrays.asList("Hello", " ", "world", "!");
		String comb = str2.stream().reduce("",(a,b) -> a+b);
		System.out.println(comb);
		

	}
}
