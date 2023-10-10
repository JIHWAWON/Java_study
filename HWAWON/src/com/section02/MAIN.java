package com.section02;

import java.io.File;
import java.io.FileOutputStream;

public class MAIN {
	public static void main(String[] args) {

		try {
			File f = new File("example.txt");
			if (!f.exists()) {
				f.createNewFile();
			}

			FileOutputStream fos = new FileOutputStream(f);
			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					String str = i + "x" + j + "=" + (i * j)+"\n";
					byte[] b = str.getBytes();
					fos.write(b);
				}
			}
			fos.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}
}
