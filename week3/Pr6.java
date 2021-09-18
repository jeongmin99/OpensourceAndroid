package week3;
import java.util.Scanner;

public class Pr6 {

	public static void main(String[] args) {
		
		System.out.print("금액을 입력하시오>>");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] unit= {50000,10000,1000,100,10,1};
		for(int i=0;i<unit.length;i++)
		{
			System.out.println(unit[i]+"원 짜리 : "+ n/unit[i]+"개");
			n-=n/unit[i]*unit[i];
		}
	}
}
