package ex06;

class Counter {

	int count = 0;

	synchronized public void increment() {  //synchronized : 한 번에 하나의 스레드만
		count++;  //+1
	}

	synchronized public void decrement() {
		count--;  //-1
	}

	public int getCount() {
		return count;
	}
}
//=================================================================================

public class CurrentThread04 {

	public static Counter cnt = new Counter(); //Counter클래스의 객체생성, 정적멤버변수(cnt)

	public static void main(String[] args) throws InterruptedException { //예외처리선언부(throws ~)포함

		Runnable task1 = () -> { //객체생성,람다
		for (int i = 0; i < 1000; i++) { //0~999
				cnt.increment();
			}
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 1000; i++) {
				cnt.decrement();
			}
		};
		Thread t1 = new Thread(task1);  //task1을 실행할 새로운 스레드 t1을 생성
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();

		t1.join(); //t1 스레드가 종료될 때까지 현재 스레드(main 스레드)를 대기
		t2.join();

		System.out.println("count :" + cnt.getCount());//t1과 t2의 작업이 완료된 후, count 값을 출력
	}

}