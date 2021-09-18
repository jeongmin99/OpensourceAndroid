package week3;
import java.util.Scanner;
public class Pr16 {

	public static void main(String[] args) {
		
		String str[]= {"가위","바위","보"};
		Scanner sc=new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true)
		{
			System.out.print("가위 바위 보!>>");
			String ans=sc.nextLine();
			if(ans.equals("그만"))
				break;
			int n=(int)(Math.random()*3);
			System.out.print("사용자 = "+ans+", 컴퓨터 = "+str[n]+", ");
			if(str[n].equals("가위"))
			{
				if(ans.equals("가위"))
				{
					System.out.println("비겼습니다.");
				}
				else if(ans.equals("바위"))
				{
					System.out.println("사용자가 이겼습니다.");
				}
				else
				{
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
			else if(str[n].equals("바위"))
			{
				if(ans.equals("가위"))
				{
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if(ans.equals("바위"))
				{
					System.out.println("비겼습니다.");
				}
				else
				{
					System.out.println("사용자가 이겼습니다.");
				}
				
			}
			else
			{
				if(ans.equals("가위"))
				{
					System.out.println("사용자가 이겼습니다.");
				}
				else if(ans.equals("바위"))
				{
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else
				{
					System.out.println("비겼습니다.");
				}
			}
			
		}
	}
}
