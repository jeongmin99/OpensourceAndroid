package week2;
import java.util.*;
public class Pr6 {

	public static void main(String[] args) {
	
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
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
			System.out.println("�ڼ�¦");
		else if(count==2)
			System.out.println("�ڼ�¦¦");
		else;
	}
}
