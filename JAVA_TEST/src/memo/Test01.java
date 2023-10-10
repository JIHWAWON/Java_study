package memo;

public class Test01 {

	public static void main(String[] args) { // 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("2+4+6+....100의 합 : " + sum);

	}
}
