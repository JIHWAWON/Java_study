package lecture_practice;

public class SmartPhone extends Phone {

	public boolean wifi;

//==========================
	public SmartPhone(String model, String color ,boolean wifi) {
		super(model,color);
		this.wifi = wifi;
	}

//==========================
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public void youtube() {
		System.out.println("유튜브 접속");
	}
}
