package ex06;

class Printer {
	
	private boolean isHelloTurn = true; //멤버변수(boolean) 선언, 초기값true

	synchronized public void printHello() {  //synchronized : 한 번에 하나의 스레드만
		while (!isHelloTurn) {  //isHelloTurn이 true일 때까지 대기
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hello"); //isHelloTurn이 true인 경우 "Hello"를 출력
		isHelloTurn = false;  // false로 변경하여 printWorld 메서드가 실행될 차례
		notify();
	}

	synchronized public void printWorld() {  //isHelloTurn이 true일 때까지 대기
		while (!isHelloTurn) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("World");
		isHelloTurn = true;
		notify();  //notify() 메서드를 호출하여 다음 차례의 스레드가 실행
	}
}  //"Hello"와 "World"를 번갈아가며 출력

public class CurrentThread05 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("World");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
}