import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write01 {
	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("c:/data/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;

			os.write(a);
			os.write(b);
			os.write(c);

			os.flush(); // 버퍼 클리어
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료!");
	}
}
