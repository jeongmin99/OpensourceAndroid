package week8;
import java.io.*;
import java.util.Scanner;

public class pr6 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileReader fReader = null;
		FileWriter fWriter = null;
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String s1 = scanner.nextLine();
		
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String s2 = scanner.nextLine();
		try {
			fReader = new FileReader(s1); 
			fWriter = new FileWriter("appended.txt");
			writeToFile(fReader, fWriter); 
			fReader.close(); 
			
			fReader = new FileReader(s2); 
			writeToFile(fReader, fWriter); 
			
			fReader.close();
			fWriter.close();
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");		
			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		scanner.close();
	}

	static void writeToFile(FileReader in, FileWriter out) throws IOException {
		char buf[] = new char[50]; 
		int count = 0; 
		while (true) {
			count = in.read(buf, 0, buf.length); 
			if(count == -1)
				break;
			if (count > 0) {
				out.write(buf, 0, count);
			}
		}
	}
}