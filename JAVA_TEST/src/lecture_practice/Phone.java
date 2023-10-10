package lecture_practice;

public class Phone {

	String model;
	String color;
//==========================
//	public Phone() {}

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

//==========================
	public void bell() {
		System.out.println("전화벨 울림");
	}

	public void sendVoice(String a) {
		System.out.println("음성메세지> " + a);
	}

	public void hangup() {
		System.out.println("전화 끊기");
	}
}