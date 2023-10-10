package ex09;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class LinkedListQueue {  //처음에 들어온 요소가 먼저 처리

	public static void main(String[] args) {
		
//		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
		Queue<String> queue = new LinkedTransferQueue<String>();  //Queue 인터페이스를 구현한 LinkedList 기반의 큐(queue)를 생성

		queue.add("toy");  //큐는 요소를 추가한 순서대로 요소를 보관
		queue.offer("box");
		queue.offer("robot");
		queue.offer("toy");

		System.out.println(queue.poll()); //큐의 맨 앞에 있는 요소를 제거하고 출력 =toy
		System.out.println(queue.poll());  //box
		System.out.println("----------------------------");
		for (String s : queue)  //robot,toy
			System.out.println(s);

		System.out.println("----------------------------");
		for (String s : queue)
			System.out.println(s);
		System.out.println("----------------------------");

		System.out.println(queue.peek());  //큐의 맨 앞에 있는 요소를 제거하지 않고 출력 =robot
		System.out.println("----------------------------");
		for (String s : queue)
			System.out.println(s);

	}
}