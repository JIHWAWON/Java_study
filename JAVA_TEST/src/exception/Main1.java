package exception;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		String[][] student = new String[3][7];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("학생 " + (i + 1));
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int mat = sc.nextInt();
			int sum = kor + eng + mat;
			System.out.print("합계 : " + sum + " / ");
			int avg = sum / 3;
			System.out.println("평균 : " + avg);

			student[i][0] = name;
			student[i][1] = String.valueOf(age);
			student[i][2] = String.valueOf(kor);
			student[i][3] = String.valueOf(eng);
			student[i][4] = String.valueOf(mat);
			student[i][5] = String.valueOf(sum);
			student[i][6] = String.valueOf(avg);
		}

		for (int i = 0; i < 3; i++) {
			System.out.print("학생 " + (i + 1) + " >>   ");
			System.out.print("이름 : " + student[i][0] + " | ");
			System.out.print("나이 : " + student[i][1] + " | ");
			System.out.print("국어점수 : " + student[i][2] + " | ");
			System.out.print("영어점수 : " + student[i][3] + " | ");
			System.out.print("수학점수 : " + student[i][4] + " | ");
			System.out.print("합계 : " + student[i][5] + " | ");
			System.out.println("평균 : " + student[i][6]);
		}

	}
}
