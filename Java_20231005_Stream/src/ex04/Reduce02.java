package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Reduce02 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		int result = numbers.stream().filter(s -> s % 2 == 1).reduce(1, (a, b) -> a * b);
		// 1*3 *5 *7 *9 = 945
		System.out.println(result);

		List<String> str = Arrays.asList("apple", "banana", "cherry", "blueberry"); //문자열을 저장 리스트(str)생성 및 초기화
		List<String> list = str.stream().filter(s -> s.length() > 5).collect(Collectors.toList()); 
		//리스트를 스트림으로 변환, filter로 길이 5보다 큰 문자열만 선택, collect로 다시 리스트로 수집(그룹화)
		System.out.println(list);

		Map<String, List<Integer>> m = numbers.stream().collect(Collectors.groupingBy(s -> s % 2 == 0 ? "짝수" : "홀수"));
		//리스트를 짝수와 홀수로 분류하여 그룹화
		System.out.println("짝수 " + m.get("짝수"));
		System.out.println("홀수 " + m.get("홀수"));
		
	}
}
