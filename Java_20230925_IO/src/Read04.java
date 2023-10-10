import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Read04 {
	public static void main(String[] args) throws IOException {

		Reader r = new FileReader("c:/data/temp4.txt");
		char[] data = new char[100];

		while (true) {
			int num = r.read(data);
			if (num == -1)
				break;

			for (int i = 0; i < num; i++) {
				System.out.print(data[i]);
				System.out.println("\n----------------------------------------------");
			}
		}
		r.close();
	}
}
