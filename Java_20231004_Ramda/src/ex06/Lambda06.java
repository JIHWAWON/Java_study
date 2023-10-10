package ex06;

@FunctionalInterface

interface Cal_01 {
	int square(int x);
}

interface Cal_02 {
	int roll();
}

interface Cal_03 {
	int sumArr(int[] arr);
}

public class Lambda06 {
	public static void main(String[] args) {

		Cal_01 cal1 = (x) -> x * x;
		int result1 = cal1.square(3);
		System.out.println(result1);
//================================
		Cal_02 cal2 = () -> (int) (Math.random() * 6);
		int result2 = cal2.roll();
		System.out.println(result2);
//================================
		Cal_03 cal3 = (int[] arr) -> {
			int sum = 0;
			for (int i : arr)
				sum += i;
			return sum;
		};
		int result3 = cal3.sumArr(new int[] { 1, 2, 3, 4, 5 });
		System.out.println(result3);

	}
}
