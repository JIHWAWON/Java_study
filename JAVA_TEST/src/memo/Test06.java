package memo;

public class Test06 {

	public static void main(String[] args) {
		int score = 65;

		String result1 = score >= 90 ? "A" : "B";
		String result2 = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "D";
		System.out.println(result2);

	}

}
