package ex06;

public class CurrentThread01 {

	public static void main(String[] args) {

		Thread thr = Thread.currentThread();  //현재 실행중인 스레드 반환

		String name = thr.getName();  //해당 스레드의 이름을 가져오기
		System.out.println("스레드 이름 : " + name); 
	}

}
