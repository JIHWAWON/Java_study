package memo;

public class Test03 {

	public static void main(String[] args) { // 두 개의 주사위를 던졌을 때, 합이 6이 되는 모든 경우의 수
		int sum;

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				sum = (i + j);
				if (sum == 6) {
					System.out.println("합이 6이 되는 경우의 수는 " + i + "+" + j);
				}
			}
		}
	}
}
