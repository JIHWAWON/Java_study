import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read02 {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/data/test2.db");

		byte[] data = new byte[100];

		while (true) {
			int num = is.read(data);
			if (num == -1)
				break;
			System.out.println("num:" + num);

			for (int i = 0; i < num; i++) {
				System.out.println(data[i]);
			}
			is.close();
		}
	}
}
