package test;

import java.util.Scanner;

public class Test03 {

	static final int book_Num = 3;     //ISBN1234, ISBN1235, ISBN1236
	static final int book_Info = 7;    //ISBN | 도서명 | 정가 | 저자 | 도서설명 | 분야 | 출간일

	static CartItem01[] oCartItem01 = new CartItem01[book_Num];    //2. 장바구니 상품 목록 보기
	static int jangbaguni = 0;    //현재 장바구니에 담긴 상품의 수 '0'으로 초기화

// ========================================================================

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
					menuGuestInfo(irum, num);    //1. 고객 정보 확인하기
					break;

				case 2:
					menuCartItem01List();    //2. 장바구니 상품 목록 보기
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
		s.close();    //main메서드의 스캐너 닫기
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

	public static void menuGuestInfo(String a, String b) {    //1. 고객 정보 확인하기 = (irum, num)
		System.out.println("현재 고객 정보: ");
		/* System.out.println("이름 " + a + "  연락처 " + b); */
		Person perObj = new Person(a, b);    //Person클래스 객체생성 = Person(String name, String phone)생성자
		System.out.println("이름 " + perObj.getName() + "연락처 " + perObj.getPhone());    //private변수를 getter 통해서 읽기
	}
// ===========

	public static void menuCartItem01List() {    //2. 장바구니 상품 목록 보기
		System.out.println("장바구니 상품 목록 :");
		System.out.println("-------------------------------------------");
		System.out.println("  도서ID\t|     수량\t|     합계");

		for (int i = 0; i < jangbaguni; i++) {    //장바구니에 담긴 상품 수만큼 반복
			System.out.print(oCartItem01[i].getBookID() + "|");
			System.out.print("      " + oCartItem01[i].getQuantity() + "\t| ");
			System.out.print("   " + oCartItem01[i].getTotalPrice());
			System.out.println("   ");
		}
		System.out.println("-------------------------------------------");
	}
// ===========

	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}
// ===========

	public static void menuCartAddItem() {    //4. 도서정보 보여주고, 장바구니에 항목 추가하기

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
			int index = -1;
			for (int i = 0; i < book_Num; i++) {
				if (input.equalsIgnoreCase(book[i][0])) {
					index = i;
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("장바구니에 추가하겠습니까 Y|N");
				input = s.nextLine();
				if (input.toUpperCase().equals("Y")) {
					System.out.println(book[index][0] + "도서가 장바구니에 추가되었습니다.");
					if (!isCartInbook(book[index][0])) 
						oCartItem01[jangbaguni++] = new CartItem01(book[index]);  
				}      //현재 jangbaguni값을 사용하고 나서, 그 값을 1 증가 : 배열 oCartItem01의 다음 위치에 새로운 CartItem01 객체를 생성하여 추가
				quit = true;
			} else
				System.out.println("다시 입력해 주세요");
		}
	}
// ===========도서를 장바구니에 추가하기 전, 이미 동일한 도서가 담겨있는지 확인 - 이미 담겨있다면 수량을 증가시키고 합계를 업데이트, 없다면 새로운 도서를 장바구니에 추가
	public static boolean isCartInbook(String bb) {    //ISBN1234, ISBN1235, ISBN1236
		boolean flag = false;
		for (int i = 0; i < jangbaguni; i++) {  
			if (bb.equals(oCartItem01[i].getBookID())) {  //static CartItem01[] oCartItem01 = new CartItem01[book_Num]; = 3
				oCartItem01[i].setQuantity(oCartItem01[i].getQuantity() + 1);  //일치하는 도서를 찾았을 경우, 도서 수량 1 증가
				oCartItem01[i].updateTotalPrice();    //해당 도서의 합계를 업데이트
				flag = true;  // 해당 도서가 장바구니에 이미 담겨있다
				break;    //도서를 찾았으면 더 이상 반복할 필요 없음
			}
		}
		return flag;  //도서가 장바구니에 이미 담겨있으면 true를 반환하고, 그렇지 않으면 false를 반환
	}
// ===========

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
