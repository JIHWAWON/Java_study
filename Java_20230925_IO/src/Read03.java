import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Read03 {
	public static void main(String[] args) throws IOException {
		
		Reader r = new FileReader("c:/data/temp3.txt");

		while (true) {
			int read = r.read();
			if (read == -1)
				break;
			System.out.println((char) read);
		}
		
		r.close();
		System.out.println("====================================");

		r = new FileReader("c:/data/temp3.txt");
		char[] data = new char[100];
		while (true) {
			int num = r.read(data);
			if (num == -1)
				break;

			for (int i = 0; i < num; i++) {
				System.out.println(data[i]);
			}
		}
		r.close();
	}
}
