package ex02;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------1------------------");

		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("================2================");
		
		list.remove(0);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------3--------------");

		list.add(1, "tthth");
		for (String s : list) {
			System.out.println(s);
		}
		
	}

}
