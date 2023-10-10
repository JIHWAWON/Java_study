package ex11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap();

		map.put(45, "toy");
		map.put(35, "robot");
		map.put(25, "box");
		map.put(15, "toy");
		map.put(45, "toy2");

		System.out.println(map.get(45));

		Set<Integer> keySet = map.keySet();

		for (int i : keySet) {
			System.out.print(i + " ");

		}
		System.out.println("\n-----------------");

		for (int i : keySet) {
			System.out.print(map.get(i) + " ");
		} 
		System.out.println("\n-----------------");

		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			System.out.print(map.get(itr.next()));
		}
	}
}