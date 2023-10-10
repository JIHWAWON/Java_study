package ex06;

public class CurrentThread03 {

	public static void main(String[] args) {

		Runnable task1 = () -> { // 객체 task1 생성
			for (int i = 0; i < 20; i++) {  //0~19
				if (i % 2 == 0)  
					System.out.printf(i + " "); //짝수 출력
				try {
					Thread.sleep(1000); //각 숫자를 1초(1000밀리초)동안 일시정지하며 출력
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 1)  //홀수 출력
					System.out.printf(i + " "); 
				try {
					Thread.sleep(1000);  
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(task1, "MyThread"); //task1을 실행할 새로운 스레드 t1을 생성(스레드이름 MyThread)
		Thread t2 = new Thread(task2, "MyThread");
		t1.start();
		t2.start();

		System.out.println("end : " + Thread.currentThread().getName()); 
		//t1과 t2가 동시에 실행, 각각 짝수와 홀수를 1초 간격으로 출력
	}

}