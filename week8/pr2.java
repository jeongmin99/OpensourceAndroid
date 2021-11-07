package week8;

import java.io.*;

public class pr2 {

	public static void main(String[] args) {
		BufferedReader br = null;
		File f = new File("c:\\temp\\phone.txt");
		try {
			br = new BufferedReader(new FileReader(f));
			System.out.println(f.getPath() + "를 출력합니다.");
			while (true) {
				String cur = br.readLine();
				if (cur == null)
					break;
				System.out.println(cur);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
