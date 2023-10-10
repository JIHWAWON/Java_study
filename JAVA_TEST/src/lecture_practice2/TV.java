package lecture_practice2;

public class TV { // TV Test

	String color;  //null
	boolean power; //false
	int channel; //0


	TV() {   
		System.out.println("기본생성자");
	}
	TV(int n) {
		System.out.println("일반생성자 : 매개변수 1개");
	}

	TV(String lang, int n) {
		System.out.println("일반생성자 : 매개변수 2개");
	}

	
	void power() {
		power = !power; // (Boolean) 호출시, false가 되어 전원을 끄고, 다시 호출하면 power 변수의 값은 true가 되어 전원을 켬
	}

	void channelUp() { // 채널 바꾸기
		channel++;
	} 

	void channelDown() {
		channel--;
	}
}