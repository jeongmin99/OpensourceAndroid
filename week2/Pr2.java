package week2;
import java.util.*;
public class Pr2 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		n=sc.nextInt();
		if(n%10==n/10)
		{
			System.out.println("Yes! 10���ڸ��� 1���ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No, 10���ڸ��� 1���ڸ��� �ٸ��ϴ�.");
		}
	}
}
