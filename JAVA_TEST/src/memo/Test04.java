package memo;

public class Test04 {

	public static void main(String[] args) { // 문자열 =12345, 개별문자로 분리해서 합(15)을 구하기, chatAt(int i)
		String str = "12345";
		int sum = 0;
		char a = str.charAt(2);

		System.out.printf("%c \n", c); // 문자3
		System.out.printf("%d \n", c - '0'); // 숫자3

		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}

		System.out.println(sum); // 15

	}
}
//		String str = "12345";
//		int sum = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			char a = str.charAt(i);
//			int b = Character.getNumericValue(a);
//			sum += b;
//		}
//
//		System.out.println(sum); 