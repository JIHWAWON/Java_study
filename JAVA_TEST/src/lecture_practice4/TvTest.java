package lecture_practice4;

public class TvTest { // TV
	public static void main(String[] args) {

		TV tv = new TV(10);
		System.out.println(tv.channel);
		tv.channelDown();
		System.out.println(tv.channel);
		
		TV tv1 = new TV("black", false, 7);


	}

}
