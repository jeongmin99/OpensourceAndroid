package week8;

import java.io.*;
import java.util.*;

public class pr10 {
	String fileName = "c:\\temp\\phone.txt";
	HashMap<String, String> phoneMap = new HashMap<String, String>();

	public pr10() {
	}

	void readPhoneFile() {
		try {
			Scanner fScanner = new Scanner(new FileReader(new File(fileName)));
			while (fScanner.hasNext()) {
				String name = fScanner.next();
				String tel = fScanner.next();
				phoneMap.put(name, tel);
			}
			fScanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
	}

	void processQuery() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�̸�>> ");
			String name = sc.next();
			if (name.equals("�׸�"))
				break;
			String tel = phoneMap.get(name);
			if (tel == null) {
				System.out.println("ã�� �̸��� �����ϴ�.");
			} else {
				System.out.println(tel);
			}
		}

		sc.close();
	}

	public void run() {
		readPhoneFile();
		processQuery();
	}

	public static void main(String[] args) {
		pr10 p = new pr10();
		p.run();
	}

}