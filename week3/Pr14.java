package week3;
import java.util.Scanner;
public class Pr14 {
	public static void main(String[] args) {
		String course[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String name;
			System.out.print("�����̸�>>");
			name=sc.nextLine();
			if(name.equals("�׸�"))
			{
				break;
			}
			int isin=0;
			for(int i=0;i<course.length;i++)
			{
				if(name.equals(course[i]))
				{
					System.out.println(course[i]+"�� ������ "+score[i]);
					isin=1;
					break;
				}
			}
			if(isin==0)
				System.out.println("���� �����Դϴ�.");
		}
	}

}
