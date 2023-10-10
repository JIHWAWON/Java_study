package ex08;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<Integer>();

		tree.add(3);
		tree.add(2);
		tree.add(7);
		tree.add(4);

		for (int num : tree)
			System.out.println(num);
	}
}