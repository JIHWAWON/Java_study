package lecture_practice;

public class TV { // TV Test

	String color;
	boolean power;
	int channel;

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