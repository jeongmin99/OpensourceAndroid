package week3;
import java.util.Scanner;
public class Pr16 {

	public static void main(String[] args) {
		
		String str[]= {"����","����","��"};
		Scanner sc=new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true)
		{
			System.out.print("���� ���� ��!>>");
			String ans=sc.nextLine();
			if(ans.equals("�׸�"))
				break;
			int n=(int)(Math.random()*3);
			System.out.print("����� = "+ans+", ��ǻ�� = "+str[n]+", ");
			if(str[n].equals("����"))
			{
				if(ans.equals("����"))
				{
					System.out.println("�����ϴ�.");
				}
				else if(ans.equals("����"))
				{
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				else
				{
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(str[n].equals("����"))
			{
				if(ans.equals("����"))
				{
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(ans.equals("����"))
				{
					System.out.println("�����ϴ�.");
				}
				else
				{
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				
			}
			else
			{
				if(ans.equals("����"))
				{
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				else if(ans.equals("����"))
				{
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				else
				{
					System.out.println("�����ϴ�.");
				}
			}
			
		}
	}
}
