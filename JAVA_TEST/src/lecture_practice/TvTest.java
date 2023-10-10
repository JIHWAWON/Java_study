package lecture_practice;

public class TvTest { // TV
	public static void main(String[] args) {

		TV tv1 = new TV();  //생성자는 반환타입X,
		tv1.channel = 7;    //객체생성, 생성자호출(객체 생성되기 위해서는 반드시 생성자를 통해서 생성한다), 생성자는 오버로딩 가능 
		tv1.channelDown();
		System.out.println(tv1.channel); // 6

		TV tv2 = new TV(); // 객체 생성, 변수에 할당
		System.out.println(tv2.channel); // 0

		TV tv3; // 변수만 선언
		tv3 = tv1;
		System.out.println(tv3.channel); // 6
		tv3.channel = 100;
		System.out.println(tv1.channel); // 100
		System.out.println(tv3.channel); // 100

	}

}
