package lecture_practice4;

public class TV { // TV Test

	String color;
	boolean power;
	int channel;

	TV() { // 생성자 역할 : 멤버변수 초기화
		System.out.println("기본생성자");
	}

	TV(int channel) {
		this.channel = channel;
	}

	TV(String color, boolean p, int channel) {
		this.color = color;
		power = p;
		this.channel = channel;

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