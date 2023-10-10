package memo;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int balance = 0;

		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.println("선택>");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("예금액>");
				balance += sc.nextInt();
				break;

			case 2:
				System.out.println("출금액>");
				balance -= sc.nextInt();
				break;

			case 3:
				System.out.println("잔고>" + balance);
				break;

			case 4:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			}
		}
	}
}
