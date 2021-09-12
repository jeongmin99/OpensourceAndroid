package week2;
import java.util.Scanner; 
public class Pr4 {

	public static void main(String[] args) {
		int a,b,c;
		int middle;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(b>c)
			{
				middle=b;
			}
			else
			{
				middle=c;
			}
		}
		else
		{
			if(a>c)
			{
				middle=a;
			}
			else
			{
				middle=c;
			}
		}
		System.out.println("중간 값은 "+middle);
	}
}
