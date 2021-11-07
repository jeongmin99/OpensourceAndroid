package week8;

import java.io.*;
import java.util.Scanner;

public class pr4 {
	public static void main(String[] args){
		System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
		try {
			Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini")); 
			int num = 1;
			while(fScanner.hasNext()) { 
				String cur = fScanner.nextLine();
				System.out.printf("%4d", num++); 
				System.out.println(": "+cur); 
			}
			fScanner.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
}