package week4;

import java.util.Scanner;

class Dictionary
{
	private static String[] kor= {"���","�Ʊ�","��","�̷�","���"};
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
		return "���� ������ �����ϴ�.";
	}
}
public class Pr10 {

	public static void main(String[] args) {
		
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("�ѱ۴ܾ�?");
			String kor=sc.next();
			if(kor.equals("�׸�"))
				break;
			
			System.out.println(kor+"�� "+Dictionary.kor2Eng(kor));
			
		}
	}
}
