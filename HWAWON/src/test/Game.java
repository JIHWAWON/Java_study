package test;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Random r = new Random();
		int rNum = r.nextInt(100) + 1; // 1부터 100 사이의 랜덤 숫자 생성
		
		int count = 0;
		
		boolean quit = false;

		System.out.println("숫자 맞추기 게임을 시작합니다. 1부터 100까지의 숫자를 맞춰보세요!");

		while (!quit) {
			System.out.print("예상한 숫자를 입력하세요: ");
			int guess = s.nextInt();
			
			count++;

			if (guess == rNum) {
				System.out.println("축하합니다! 숫자 " + rNum + "를 " + count + "번만에 맞추셨습니다.");
				quit = true;
			} else if (guess < rNum) {
				System.out.println("더 큰 숫자를 입력하세요.");
			} else {
				System.out.println("더 작은 숫자를 입력하세요.");
			}
		}

		s.close();
	}

}
