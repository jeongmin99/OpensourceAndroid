package week4;

import java.util.Scanner;

class Dictionary
{
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","moeny","future","hope"};
	public static String kor2Eng(String word)
	{
	
		for(int i=0;i<kor.length;i++)
		{
			if(kor[i].equals(word))
			{
				return eng[i];
			}
		}
		return "저의 사전에 없습니다.";
	}
}
public class Pr10 {

	public static void main(String[] args) {
		
		System.out.println("한글 단어 검색 프로그램입니다.");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("한글단어?");
			String kor=sc.next();
			if(kor.equals("그만"))
				break;
			
			System.out.println(kor+"는 "+Dictionary.kor2Eng(kor));
			
		}
	}
}
