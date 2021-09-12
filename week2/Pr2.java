package week2;
import java.util.*;
public class Pr2 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		n=sc.nextInt();
		if(n%10==n/10)
		{
			System.out.println("Yes! 10의자리와 1의자리가 같습니다.");
		}
		else
		{
			System.out.println("No, 10의자리와 1의자리가 다릅니다.");
		}
	}
}
