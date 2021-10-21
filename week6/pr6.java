package week6;

import java.util.Calendar;
import java.util.Scanner;

public class pr6 {

	public static void main(String[] args) {
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		Scanner sc=new Scanner(System.in);
		Calendar cal;
		
		System.out.print("황기태 시작 <Enter>키>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int first1=cal.get(Calendar.SECOND);
		System.out.println("  현재 초 시간 = "+first1);
		System.out.print("10초 예상 후 <Enter>키>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int last1=cal.get(Calendar.SECOND);
		System.out.println("  현재 초 시간 = "+last1);
		
		System.out.print("이재문 시작 <Enter>키>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int first2=cal.get(Calendar.SECOND);
		System.out.println("  현재 초 시간 = "+first2);
		System.out.print("10초 예상 후 <Enter>키>>");
		sc.nextLine();
		cal=Calendar.getInstance();
		int last2=cal.get(Calendar.SECOND);
		System.out.println("  현재 초 시간 = "+last2);
		
		int p1ans=Math.abs(last1-first1);
		int p2ans=Math.abs(last2-first2);
		System.out.print("황기태의 결과 "+p1ans+", ");
		System.out.print("이재문의 결과 "+p2ans+", ");
		
		if(p1ans>p2ans)
			System.out.println("승자는 황기태");
		else if(p1ans<p2ans)
			System.out.println("승자는 이재문");
		else
			System.out.println("무승부");
	}
}
