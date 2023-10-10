package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("당신의 이름을 입력하세요 : ");
		String irum = s.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		String num = s.nextLine();    //int가 아니라 String로 해야 처음 0도 출력됨

		String greeting = "Welcome to Shopping Mall";
		String tag = "Welcome to Book Market!";

		boolean quit = false;
		while (!quit) {    // ! = boolean 값 반전/부정, quit변수가 true가 될때까지 while반복문
			System.out.println("*******************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tag);
			System.out.println("*******************************************");
			System.out.println("1. 고객 정보 확인하기\t\t 4. 바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기\t 5. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기\t\t 6. 장바구니의 항목 삭제하기");
			System.out.println("7. 영수증 표시하기\t\t 8. 종료");
			System.out.println("*******************************************");
			System.out.print("메뉴 번호를 선택해주세요 ");

			int choice = s.nextInt();
			if (choice < 1 || choice > 8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			} else {
				switch (choice) {
				case 1:
					System.out.println("현재 고객 정보: ");
					System.out.println("이름 " + irum + "  연락처 " + num);
					break;

				case 2:
					System.out.println("2. 장바구니 상품 목록 보기");
					break;

				case 3:
					System.out.println("3. 장바구니 비우기");
					break;

				case 4:
					System.out.println("4. 장바구니에 항목 추가하기");
					break;

				case 5:
					System.out.println("5. 장바구니의 항목 수량 줄이기");
					break;

				case 6:
					System.out.println("6. 장바구니의 항목 삭제하기");
					break;

				case 7:
					System.out.println("7. 영수증 표시하기");
					break;

				case 8:
					System.out.println("8. 종료");
					quit = true;
					break;

				} //switch
			} //else
		} //while
		s.close();    //main메서드 안의 Scanner 닫기
	} //main메서드
} //클래스 닫기
