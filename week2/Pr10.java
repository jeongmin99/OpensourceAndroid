package week2;
import java.util.*;
public class Pr10 {

	public static void main(String[] args) {
		
		int x1,y1,r1;
		int x2,y2,r2;
		Scanner scanner=new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextInt();
		
		if((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)>(r1+r2)*(r1+r2))
		{
			System.out.println("�ο��� ���� �� ��ģ��");
		}
		else
		{
			System.out.println("�� ���� ���� ��ģ��");
		}
	}
}
