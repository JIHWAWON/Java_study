package book_market;

import java.util.Scanner;

public class Welcome {
	static final int NUM_BOOK = 3;
	static final int BOOK_INFO = 7;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String irum = s.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		String num = s.nextLine();

		String greeting = "Welcome to Shopping Mall";
		String tag = "Welcome to Book Market!";

		boolean quit = false;
		while (!quit) {
			System.out.println("***************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tag);
			System.out.println("***************************************");
			Menu();

			System.out.print("메뉴 번호를 선택해주세요 ");
			int choice = s.nextInt();

			if (choice <= 0 || choice > 8) {
				System.out.println("1부터 8까지 숫자를 입력하세요");

			} else {
//			System.out.println(choice+"번을 선택했습니다");

				switch (choice) {
				case 1:
					menuGuestInfo(irum, num);
					break;
				case 2:
					menuCartItemList();
					break;
				case 3:
					menuCartClear();
					break;
				case 4:
					menuCartAddItem();
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
				}
			}
		}
	}

//==============================================================================
	static void Menu() {
		System.out.println("1. 고객 정보 확인하기\t\t4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기\t\t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기\t\t8. 종료");
		System.out.println("***************************************");
	}

// ==============================================================================
	public static void menuGuestInfo(String a, String b) { // 1. 고객 정보 확인하기
		System.out.println("현재 고객 정보 : \n이름 " + a + " 연락처 " + b);
	}

	public static void menuCartItemList() { // 2. 장바구니 상품 목록 보기
		System.out.println("2. 장바구니 상품 목록 보기");
	}

	public static void menuCartClear() { // 3. 장바구니 비우기
		System.out.println("3. 장바구니 비우기");
	}

	public static void menuCartAddItem() { // 4. 바구니에 항목 추가하기
		String[][] mbook = new String[NUM_BOOK][BOOK_INFO];
		BookList(mbook);
		for (int i = 0; i < NUM_BOOK; i++) {
			for (int j = 0; j < BOOK_INFO; j++) {
				System.out.print(mbook[i][j] + " | ");
			}
			System.out.println();
		}
		Scanner s = new Scanner(System.in);
		String choice2 = s.nextLine();	
		
	}

	public static void menuCartRemoveItemCount() { // 5. 장바구니의 항목 수량 줄이기
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}

	public static void menuCartRemoveItem() { // 6.장바구니의 항목 삭제하기
		System.out.println("6.장바구니의 항목 삭제하기");
	}

	public static void menuCartBill() { // 7.영수증 표시하기
		System.out.println("7.영수증 표시하기");
	}

	public static void menuExit() { // 8.종료
		System.out.println("8.종료");
	}

// ==============================================================================

	public static void BookList(String[][] book) {
		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] = "IT전문서";
		book[0][6] = "2018/10/08";

		book[1][0] = "ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000";
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링!";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";

		book[2][0] = "ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000";
		book[2][3] = "고광일";
		book[2][4] = "컴퓨팅 사고력을 키운느 블록 코딩";
		book[2][5] = "컴퓨터입문";
		book[2][6] = "2019/06/10";
	}
}
