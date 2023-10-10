package ex06;

public class CurrentThread02 {

	public static void main(String[] args) {

		Runnable task = () -> { // 객체 task 생성
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName(); // 현재 실행 중인 스레드의 이름
			System.out.println(name + " : " + (n1 + n2));
		};

		Thread thread = new Thread(task); //객체 thread 생성 - > task를 실행

		thread.start(); 

		System.out.println("end = " + Thread.currentThread().getName());
	}

}
