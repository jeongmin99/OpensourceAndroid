package week8;

import java.io.*;

public class pr8 {

	public static void main(String[] args) {
		File file = new File("c:\\");
		File[] files = file.listFiles();

		long biggestSize = 0;
		File biggestFile = null;
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			if (!f.isFile())
				continue;

			long size = f.length();
			if (biggestSize < size) {
				biggestSize = size;
				biggestFile = f;
			}
		}

		if (biggestFile == null)
			System.out.println("파일은 없습니다");
		else
			System.out.println("가장 큰 파일은 " + biggestFile.getPath() + " " + biggestSize + "바이트");
	}

}