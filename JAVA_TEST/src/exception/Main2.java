package exception;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

			String[][] stu_name = new String[3][1];

			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 3; i++) {
				System.out.println("학생 " + (i + 1));
				System.out.print("이름 : ");
				stu_name[i][0] = sc.nextLine();
			}
//===========================================		

			String[][] stu_jumsu = new String[3][7];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 1; j++) {
					stu_jumsu[i][j] = stu_name[i][j];
				}
			}
			for (int i = 3; i < 7; i++) {

				System.out.print("나이 : ");
				stu_jumsu[i][1] = String.valueOf(sc.nextInt());

				System.out.print("국어 성적 : ");
				stu_jumsu[i][2] = String.valueOf(sc.nextInt());

				System.out.print("영어 성적 : ");
				stu_jumsu[i][3] = String.valueOf(sc.nextInt());

				System.out.print("수학 성적 : ");
				stu_jumsu[i][4] = String.valueOf(sc.nextInt());

				stu_jumsu[i][5] = stu_jumsu[i][2] + stu_jumsu[i][3] + stu_jumsu[i][4];
				System.out.print("합계 : " + stu_jumsu[i][5] + " / ");

				stu_jumsu[i][6] = stu_jumsu[i][5] / 3;
				System.out.println("평균 : " + stu_jumsu[i][6]);

		
		}
	}
}
