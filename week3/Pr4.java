package week3;
import java.util.Scanner;
public class Pr4 {

	public static void main(String[] args) {
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String n;
		Scanner sc=new Scanner(System.in);
		n=sc.next();
		char c=n.charAt(0);
		for(int i=0;i<=c-'a';i++)
		{
			for(int j='a';j<=c-i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
