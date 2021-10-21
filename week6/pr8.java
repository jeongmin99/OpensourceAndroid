package week6;

import java.util.Scanner;

public class pr8 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		int pel=0;
		while(pel<=len)
		{
			int i=0;
			int k=pel;
			for(int j=k;i<len;j++)
			{
					
				if(j>=len)
					j=0;
				System.out.printf("%c",str.charAt(j));
				i++;
					
			}
			
			pel++;
			System.out.println();
		}
	}
}
