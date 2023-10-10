package ex13;

import java.util.Arrays;

public class OtherExam2 {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 3, 7, 8, 9, 10, 2, 4 };

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		String[] str = { "box", "toy", "Toy", "Robot", "Box", "robot" };
		Arrays.sort(str);
		for (String s : str)
			System.out.print(s + " ");
	}
}