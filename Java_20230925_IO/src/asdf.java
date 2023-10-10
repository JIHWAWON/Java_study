import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class asdf {

	public static void main(String[] args) throws IOException {
		String str = "블라블랄라라";
		write(str);  
		String data = read();
		System.out.println(data);
	}

	static void write(String str) throws IOException {   // 파일에 문자열 쓰기
		OutputStream os = new FileOutputStream("c:/data/test2.txt");  
		Writer w = new OutputStreamWriter(os, "utf-8");
		w.write(str);
		w.flush();
		w.close();
	}

	static String read() throws IOException {   // 파일에서 문자열을 읽어오기
		InputStream is = new FileInputStream("c:/data/test2.txt");
		Reader r = new InputStreamReader(is, "utf-8");
		char[] data = new char[100];  //문자열을 저장할 문자배열 생성
		int num = r.read(data);  //문자열을 읽어와서 data 배열에 저장,읽은 문자 개수를 num에 저장
		r.close();
		String str = new String(data, 0, num);
		return str;
	}
}
