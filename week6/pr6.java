package week6;

import java.util.Calendar;
import java.util.Scanner;

public class pr6 {

	public static void main(String[] args) {
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		Scanner sc=new Scanner(System.in);
		Calendar cal;
		
		System.out.print("Ȳ���� ���� <Enter>Ű>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int first1=cal.get(Calendar.SECOND);
		System.out.println("  ���� �� �ð� = "+first1);
		System.out.print("10�� ���� �� <Enter>Ű>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int last1=cal.get(Calendar.SECOND);
		System.out.println("  ���� �� �ð� = "+last1);
		
		System.out.print("���繮 ���� <Enter>Ű>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int first2=cal.get(Calendar.SECOND);
		System.out.println("  ���� �� �ð� = "+first2);
		System.out.print("10�� ���� �� <Enter>Ű>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int last2=cal.get(Calendar.SECOND);
		System.out.println("  ���� �� �ð� = "+last2);
		
		int p1ans=Math.abs(last1-first1);
		int p2ans=Math.abs(last2-first2);
		System.out.print("Ȳ������ ��� "+p1ans+", ");
		System.out.print("���繮�� ��� "+p2ans+", ");
		
		if(p1ans>p2ans)
			System.out.println("���ڴ� Ȳ����");
		else if(p1ans<p2ans)
			System.out.println("���ڴ� ���繮");
		else
			System.out.println("���º�");
	}
}
