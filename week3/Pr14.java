package week3;
import java.util.Scanner;
public class Pr14 {
	public static void main(String[] args) {
		String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String name;
			System.out.print("과목이름>>");
			name=sc.nextLine();
			if(name.equals("그만"))
			{
				break;
			}
			int isin=0;
			for(int i=0;i<course.length;i++)
			{
				if(name.equals(course[i]))
				{
					System.out.println(course[i]+"의 점수는 "+score[i]);
					isin=1;
					break;
				}
			}
			if(isin==0)
				System.out.println("없는 과목입니다.");
		}
	}

}
