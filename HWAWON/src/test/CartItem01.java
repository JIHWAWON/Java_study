package test;

//2. 장바구니 상품 목록 보기
public class CartItem01 {

	private String[] itemBook = new String[7];    //변수 선언(7칸 배열). ex)ISBN1236 | 스크래치 | 22000 | 고광일 | 컴퓨터 사고력을 키우는 블록 코딩 | 컴퓨터 입문 | 2019/06/10 |
	private String bookID;     //도서ID
	private int quantity;      //수량
	private int totalPrice;    //합계

// ========================================(생성자:객체생성시 호출)=============

	public CartItem01() {    //기본생성자
	}  

	public CartItem01(String[] a) {    //일반생성자(매개변수) : String[] a배열을 받아 객체를 초기화
		this.itemBook = a;
		this.bookID = a[0];    //도서ID
		this.quantity = 1;     //수량 = 1로 초기화
		updateTotalPrice();    //updateTotalPrice()메서드 호출하여 합계를 계산
	}
// =======================================================================

	public String[] getItemBook() {   //itemBook배열
		return itemBook;
	}
	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}

	public String getBookID() {       //도서ID
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getQuantity() {       //수량
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {    //합계 : 값을 직접 설정(setter)하는 메서드가 아니라, 다른 변수들의 값을 기반으로 자동으로 계산
		return totalPrice;
	}

// ==============
	public void updateTotalPrice() {    //합계를 계산하여 업데이트
		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
	}           //문자열을 받아서 정수값으로 변환         도서 가격 * 수량

} //CartItem01클래스
