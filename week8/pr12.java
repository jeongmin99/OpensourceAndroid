package week8;

import java.io.*;
import java.util.*;

public class pr12 {
	File targetFile = null;
	Vector<String> lineVector = new Vector<String>();

	public pr12() {
	}

	void readFile(String Name) {
		targetFile = new File(Name);
		try {
			Scanner fScanner = new Scanner(new FileReader(targetFile));
			while (fScanner.hasNext()) {
				String line = fScanner.nextLine();
				lineVector.add(line);
			}
			fScanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	Vector<Integer> searchWord(String word) {
		Vector<Integer> noVector = new Vector<Integer>();
		for (int i = 0; i < lineVector.size(); i++) {
			String line = lineVector.get(i);
			if (line.indexOf(word) != -1)
				noVector.add(i);
		}

		return noVector;
	}

	void printLines(Vector<Integer> noVector) {
		for (int i = 0; i < noVector.size(); i++) {
			int lineNo = noVector.get(i);
			String line = lineVector.get(lineNo);
			System.out.println(lineNo + ":" + line);
		}
	}

	public void run() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();

		readFile(Name);

		while (true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String line = sc.nextLine();
			if (line.equals("�׸�"))
				break;
			Vector<Integer> noVector = searchWord(line);
			printLines(noVector);
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

	public static void main(String[] args) {
		pr12 p = new pr12();
		p.run();
	}
}