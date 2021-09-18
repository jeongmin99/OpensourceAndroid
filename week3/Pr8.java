package week3;
import java.util.Scanner;
public class Pr8 {

	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=(int) (1+Math.random()*100);
		}
		for(int i=0;i<n;i++)
		{
			if(i%10==0)
				System.out.println();
			System.out.print(arr[i]+" ");
			
		}
	}
}
