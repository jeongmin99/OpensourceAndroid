package week2;
import java.util.*;
public class Pr6 {

	public static void main(String[] args) {
	
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		n=scanner.nextInt();
		int count=0;
		if((n%10)%3==0)
		{
			count++;
		}
		if(n/10!=0 && (n/10)%3==0)
		{
			count++;
		}
		
		if(count==1)
			System.out.println("박수짝");
		else if(count==2)
			System.out.println("박수짝짝");
		else;
	}
}
