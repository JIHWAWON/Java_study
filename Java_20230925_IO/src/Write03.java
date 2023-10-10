import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Write03 {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("c:/data/test3.txt");

			char a = 'A'; // 한 문자씩 출력
			w.write(a);
			char b = 'B';
			w.write(b);
			char c = 'C';
			w.write(c);

			char[] arr = { 'D', 'E', 'F', 'D' }; // 배열 출력
			w.write(arr);

			String str = "HIJ"; // 문자열 저장
			w.write(str);

			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
