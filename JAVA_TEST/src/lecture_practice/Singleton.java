package lecture_practice;

public class Singleton { //(자바 디자인패턴) 싱글톤 패턴 = 어떤 클래스가 오직 하나의 인스턴스(객체)만을 가지도록 > 그것만 공유(사용)하겠다 // 생성자를 private로 접근. 외부에서 객체생성x

	private static Singleton st = new Singleton(); //객체 생성 2
//	private  Singleton st = new Singleton(); //정적메서드는 정적변수만 접근 가능하기에, static을 빼면 아래 getinstance에서 접근 불가 

	
	int apple = 100;

	private Singleton() {  //최소한 default값이어야 다른 클래스에서 쓰는데, private는 이 공간만 쓸 수 있음. so, 객체생성 밖에서 못하니 이 안에서 해야함 1
	}

	public static Singleton getInstance() {  //정적 메서드라, 정적 객체에 접근가
		return st;  // 그 객체(st)에 접근하려면 이를 통해 호출 가능 3 
	}

}
