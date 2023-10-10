package test;

import java.util.Scanner;

public class Test02 {
	static Scanner s = new Scanner(System.in);    //클래스레벨에서 선언시, s.close(); 안닫아줘도 됨 - 메서드레벨에서는 닫아줘야함
											      //클래스레벨 선언 = 여러 메서드에서 같은 Scanner객체를 사용, 메서드 간 의존성↑ 복잡성↑ So, 프로그램이 작을 땐 클래스레벨에서 선언, 클 때는 메서드레벨 선언

	//정적(모두 공유/클래스레벨 선언), final상수(값 변경x) / 멤버변수(선언,초기화) = 가독성 및 유지보수 ↑
	static final int book_Num = 3;     //ISBN1234, ISBN1235, ISBN1236
	static final int book_Info = 7;    //ISBN | 도서명 | 정가 | 저자 | 도서설명 | 분야 | 출간일
	static String book[][] = new String[book_Num][book_Info];    //book'2차원배열' 선언(3행7열)

// ===================================================================

	public static void main(String[] args) {    //멤버메서드 main() = 프로그램의 시작점

		System.out.print("당신의 이름을 입력하세요 : ");
		String irum = s.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		String num = s.nextLine();

		String greeting = "Welcome to Shopping Mall";
		String tag = "Welcome to Book Market!";

		boolean quit = false;
		while (!quit) {
			System.out.println("*******************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tag);
			System.out.println("*******************************************");
			menuIntroduction();
			System.out.print("메뉴 번호를 선택해주세요 ");

			int choice = s.nextInt();
			if (choice < 1 || choice > 8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			} else {
				switch (choice) {
				case 1:
					menuGuestInfo(irum, num);    //menuGuestInfo(String a, String b) 메서드 호출
					break;
				case 2:
					menuCartItemList();
					break;
				case 3:
					menuCartClear();
					break;
				case 4:    
					menuCartAddItem();    //4. 도서정보 보여주고, 장바구니에 항목 추가하기
					break;
				case 5:
					menuCartRemoveItemCount();
					break;
				case 6:
					menuCartRemoveItem();
					break;
				case 7:
					menuCartBill();
					break;
				case 8:
					menuExit();
					quit = true;
					break;

				} //switch
			} //else
		} //while
	} //main메서드

// ===================================================================

	public static void menuIntroduction() {
		System.out.println("1. 고객 정보 확인하기\t\t 4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기\t 5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기\t\t 6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기\t\t 8. 종료");
		System.out.println("*******************************************");
	}
// ===================================================================

	public static void menuGuestInfo(String a, String b) {    //1. 고객 정보 확인하기
		System.out.println("현재 고객 정보: ");
		System.out.println("이름 " + a + "  연락처 " + b);    //irum, num값 넣기
	}

	public static void menuCartItemList() {
		System.out.println("2. 장바구니 상품 목록 보기");
	}

	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}

	public static void menuCartAddItem() {    //4. 도서정보 보여주고, 장바구니에 항목 추가하기
		BookList(book);

		for (int i = 0; i < book_Num; i++) {        //book_Num = 3;
			for (int g = 0; g < book_Info; g++) {   //book_Info =7;
				System.out.print(book[i][g] + " | ");
			}
			System.out.println(""); // 줄바꿈
		}
//================
		boolean quit = false;
		while (!quit) {
			System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");
			Scanner s = new Scanner(System.in);    //여기에 써야 루프를 반복할 때마다 객체를 새로 생성(외부에 있으면 한번 생성되고 재사용)
			String input = s.nextLine();    //ISBN1234, ISBN1235, ISBN1236

			boolean flag = false;    //flag변수는 for루프를 통해 입력된 도서ID가 도서목록[0][0],[1][0],[2][0]에 있는지 확인
			int index = -1;       //초기값, 배열에 없는 [-1][0] (유효한 도서x, 목록에 없는 인덱스 -> 0,1,2 제외한 모든 숫자가 가능하지만 '-1'이	관례적)
			for (int i = 0; i < book_Num; i++) {    //book_Num = 3;
				if (input.toUpperCase().equals(book[i][0])) {    //입력된 도서 ID가 목록에 있다면
					index = i;    //해당 인덱스를 저장
					flag = true;  //목록에 있다면 flag를 true로 설정
					break;        //for반복문을 종료
				} //if문
			} //for반복문

			if (flag) {    //(flag == true)라면, 사용자에게 해당 도서를 장바구니에 추가할 것인지
				System.out.println("장바구니에 추가하겠습니까 Y|N");
				String input2 = s.nextLine();
				if (input2.equalsIgnoreCase("Y")) {
					System.out.println(book[index][0] + "도서가 장바구니에 추가되었습니다.");
				}
				quit = true;
			} else    //(flag == false)
				System.out.println("다시 입력해 주세요");
		} //while반복문 끝
//================
	} //4.바구니에 항목 추가하기 끝

	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}

	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}

	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
	}

	public static void menuExit() {
		System.out.println("8. 종료");
	}

// ===================================================================

	public static void BookList(String b[][]) {    //매개변수 => 외부에서 전달받은 2차원배열 사용해 작업
		b[0][0] = "ISBN1234";
		b[0][1] = "쉽게 배우는 JSK 웹 프로그래밍";
		b[0][2] = "27000";
		b[0][3] = "송미영";
		b[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP웹 프로그래밍";
		b[0][5] = "IT전문서";
		b[0][6] = "2018/10/08";

		b[1][0] = "ISBN1235";
		b[1][1] = "안드로이드 프로그래밍";
		b[1][2] = "33000";
		b[1][3] = "우재남";
		b[1][4] = "실습 단계별 명쾌한 멘토링";
		b[1][5] = "IT전문서";
		b[1][6] = "2022/01/22";

		b[2][0] = "ISBN1236";
		b[2][1] = "스크래치";
		b[2][2] = "22000";
		b[2][3] = "고광일";
		b[2][4] = "컴퓨터 사고력을 키우는 블록 코딩";
		b[2][5] = "컴퓨터 입문";
		b[2][6] = "2019/06/10";
	}
} //클래스 닫기
