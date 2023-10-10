package ex08;

import java.util.Arrays;
import java.util.List;

public class ForeachExam {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Box", "Toy", "Robot", "Toy", "Box");

		for (String ll : list)
			System.out.println(ll);
		System.out.println("------------------------------");

		list.forEach(s -> System.out.println(s));
		System.out.println("------------------------------");

		list.forEach(System.out::println);

	}
}
