package test;

import java.util.Scanner;

public class Test04 {

	static final int book_Num = 3;     //ISBN1234, ISBN1235, ISBN1236
	static final int book_Info = 7;    //ISBN | 도서명 | 정가 | 저자 | 도서설명 | 분야 | 출간일

	// ========================================================================

	static CartItem01[] mCartItem01 = new CartItem01[book_Num];
	static int mCartCount = 0;

	// ========================================================================

	static User mUser;
	// ========================================================================

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String irum = s.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		String num = s.nextLine();    //int가 아니라 String로 해야 처음 0도 출력됨

		mUser = new User(irum, num);

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

			if (choice < 1 || choice > 9) {
				System.out.println("1부터 9까지의 숫자를 입력하세요.");
			} else {
				switch (choice) {
				case 1:
					menuGuestInfo(irum, num);
					break;

				case 2:
					menuCartItem01List();
					break;

				case 3:
					menuCartClear();
					break;

				case 4:
					menuCartAddItem();
					quit = true;

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

				case 9:
					menuAdminLogin();
					break;

				} //switch
			} //else
		} //while
	}

// ===================================================================

	public static void menuIntroduction() {

		System.out.println("1. 고객 정보 확인하기\t 4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기\t 5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기\t\t 6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기\t\t 8. 종료");
		System.out.println("9. 관리자 로그인");

		System.out.println("*******************************************");
	}

// ===================================================================

	public static void menuGuestInfo(String a, String b) {
		System.out.println("현재 고객 정보: ");
//		Person perObj = new Person(a, b); // 이름(a)과 전화번호(b)를 입력받아 Person 클래스를 사용하여 고객 객체(perObj)를 생성하고, 그 객체에서 이름과 전화번호를
//											// 가져와서 출력
//		System.out.println("이름 " + perObj.getName() + "연락처 " + perObj.getPhone());
		System.out.println("이름 " + mUser.getName() + "연락처 " + mUser.getPhone());
	}

	public static void menuCartItem01List() {
		System.out.println("장바구니 상품 목록 :");
		System.out.println("-------------------------------------------");
		System.out.println("  도서ID\t|     수량\t|     합계");

		for (int i = 0; i < mCartCount; i++) {    //장바구니에 담긴 상품 수만큼 반복
			System.out.print(mCartItem01[i].getBookID() + "|");
			System.out.print("      " + mCartItem01[i].getQuantity() + "\t| ");
			System.out.print("   " + mCartItem01[i].getTotalPrice());
			System.out.println("   ");
		}
		System.out.println("-------------------------------------------");
	}

	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}

	public static void menuCartAddItem() {

		String[][] book = new String[book_Num][book_Info];

		BookList(book);

		for (int i = 0; i < book_Num; i++) {
			for (int g = 0; g < book_Info; g++) {
				System.out.print(book[i][g] + " | ");
			}
			System.out.println("");
		}

		boolean quit = false;
		while (!quit) {
			System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();

			boolean flag = false;
			int numId = -1;

			for (int i = 0; i < book_Num; i++) {
				if (input.equalsIgnoreCase(book[i][0])) {
					numId = i;
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("장바구니에 추가하겠습니까 Y|N");
				input = s.nextLine();
				if (input.toUpperCase().equals("Y")) {
					System.out.println(book[numId][0] + "도서가 장바구니에 추가되었습니다.");
					if (!isCartInbook(book[numId][0]))
						mCartItem01[mCartCount++] = new CartItem01(book[numId]);
					quit = true;
					menuCartItem01List();
				}
			} else
				System.out.println("다시 입력해 주세요");
		}
	}

	public static boolean isCartInbook(String bookId) {
		boolean flag = false;
		for (int i = 0; i < mCartCount; i++) {
			if (bookId == mCartItem01[i].getBookID()) {
				mCartItem01[i].setQuantity(mCartItem01[i].getQuantity() + 1);
			}
		}
		return flag;
	}

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

	public static void menuAdminLogin() {
		System.out.println("관리자 정보를 입력하세요");

		Scanner s = new Scanner(System.in);
		System.out.print("아이디 : ");
		String adminId = s.next();

		System.out.println("비밀번호 : ");
		String adminPW = s.next();

		Admin mAdmin = new Admin(mUser.getName(), mUser.getPhone());
		if (adminId.equals(mAdmin.getId()) && adminPW.equals(mAdmin.getPassword())) {
			System.out.println("이름 " + mAdmin.getName() + " 연락처 " + mAdmin.getPhone());
			System.out.println("아이디 " + mAdmin.getId() + " 비밀번호 " + mAdmin.getPassword());
		} else
			System.out.println("관리자 정보가 일치하지 않습니다.");
	}
	// ===================================================================

	public static void BookList(String[][] book) {
		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 JSK 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP웹 프로그래밍";
		book[0][5] = "IT전문서";
		book[0][6] = "2018/10/08";

		book[1][0] = "ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000";
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";

		book[2][0] = "ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000";
		book[2][3] = "고광일";
		book[2][4] = "컴퓨터 사고력을 키우는 블록 코딩";
		book[2][5] = "컴퓨터 입문";
		book[2][6] = "2019/06/10";
	}
}
