package ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherExam01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

//		List<Integer> list = {10,20,30,40,50};
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int[] intNum = new int[5];
		int[] intNum2 = { 10, 20, 30, 40, 50 };

		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);

		for (int i : list2)
			System.out.println(i + " ");
		System.out.println();

		List<String> list3 = Arrays.asList("toy", "box", "robot");
		for (String i : list3)
			System.out.println(i + " ");

		System.out.println();
		// list3.add("Box"); (x) Arrays.asList추가 안됨

		List<String> list4 = Arrays.asList("toy", "box", "robot");
		List<String> list5 = new ArrayList(Arrays.asList("toy", "box", "robot"));
		list5.add("box");
		list5.add("robot");

		for (String s : list5) {
			System.out.println(s + " ");
		}

	}
}