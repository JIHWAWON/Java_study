package test;

//1. 고객 정보 확인하기  = (irum, num)
public class Person {    //라이브러리 클래스(참조) = 'Person' 클래스를 따로 만들어 사용함으로써, 코드를 더 구조화하고 유지보수하기 쉽게 만듦

	private String name;    //private(외부접근x) 멤버변수(필드) 선언
	private String phone;
	private String address;

// ========================================================================

	public Person(String name, String phone) {    //일반생성자(매개변수)
		this.name = name;
		this.phone = phone;    //(이름,전화번호)를 인수로 받아 객체를 초기화
	}

	public Person(String a, String b, String c) {
		this.name = a;
		this.phone = b;
		this.address = c;     //(이름,전화번호,주소)를 인수로 받아 객체를 초기화
	}
// ========================================================================

	public String getName() {    //name값 반환(읽기)
		return name;
	}
	public void setName(String a) {    //name에 값을 저장
		this.name = a;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String a) {
		this.phone = a;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		this.address = a;
	}

} //Person클래스
