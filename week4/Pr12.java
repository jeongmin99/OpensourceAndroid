package week4;
import java.util.Scanner;
class seat
{
	public static String s[]= {"---","---","---","---","---","---","---","---","---","---"};
	public static String a[]= {"---","---","---","---","---","---","---","---","---","---"};
	public static String b[]= {"---","---","---","---","---","---","---","---","---","---"};
}
public class Pr12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while(true)
		{
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int n=sc.nextInt();
			if(n==4)
				break;
			else if(n==1)
			{
				while(true) {
					System.out.print("�¼����� S(1), A(2), B(3)>>");
					int sit=sc.nextInt();
					if(sit==1)
					{
						System.out.print("S>>");
						for(int i=0;i<seat.s.length;i++)
						{
							System.out.print(seat.s[i]+" ");
						}
						System.out.println();
						System.out.print("�̸�>>");
						String name=sc.next();
						System.out.print("��ȣ>>");
						int num=sc.nextInt();
						if(!seat.s[num-1].equals("---"))
							System.out.println("�̹� ����� �ڸ��Դϴ�.");
						else
						{
							seat.s[num-1]=name;
							break;
						}
					}
					else if(sit==2)
					{
						System.out.print("A>>");
						for(int i=0;i<seat.a.length;i++)
						{
							System.out.print(seat.a[i]+" ");
						}
						System.out.println();
						System.out.print("�̸�>>");
						String name=sc.next();
						System.out.print("��ȣ>>");
						int num=sc.nextInt();
						if(!seat.a[num-1].equals("---"))
							System.out.println("�̹� ����� �ڸ��Դϴ�.");
						else
						{
							seat.a[num-1]=name;
							break;
						}
					}
					else if(sit==3)
					{
						System.out.print("B>>");
						for(int i=0;i<seat.b.length;i++)
						{
							System.out.print(seat.b[i]+" ");
						}
						System.out.println();
						System.out.print("�̸�>>");
						String name=sc.next();
						System.out.print("��ȣ>>");
						int num=sc.nextInt();
						if(!seat.b[num-1].equals("---"))
							System.out.println("�̹� ����� �ڸ��Դϴ�.");
						else
						{
							seat.b[num-1]=name;
							break;
						}
					}
					else
						System.out.println("�߸��� ��ȣ�Դϴ�.");
				}
			}
			else if(n==2)
			{
				System.out.print("S>>");
				for(int i=0;i<seat.s.length;i++)
				{
					System.out.print(seat.s[i]+" ");
				}
				System.out.println();
				System.out.print("A>>");
				for(int i=0;i<seat.a.length;i++)
				{
					System.out.print(seat.a[i]+" ");
				}
				System.out.println();
				System.out.print("B>>");
				for(int i=0;i<seat.b.length;i++)
				{
					System.out.print(seat.b[i]+" ");
				}
				System.out.println();
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
			}
			else if(n==3)
			{
				while(true) {
					System.out.print("�¼� S:1, A:2, B:3>>");
					int sit=sc.nextInt();
				
					if(sit==1)
					{
						System.out.print("S>>");
						for(int i=0;i<seat.s.length;i++)
						{
							System.out.print(seat.s[i]+" ");
						}
						System.out.println();
						System.out.print("�̸�>>");
						String name=sc.next();
						int isin=0;
						for(int i=0;i<seat.s.length;i++)
						{
							if(seat.s[i].equals(name))
							{
								seat.s[i]="---";
								isin=1;
								break;
							}
						}
						if(isin==0)
						{
							System.out.println("���� �̸��Դϴ�.");
						}
						else
						{
							break;
						}
					}
					else if(sit==2)
					{
						System.out.print("A>>");
						for(int i=0;i<seat.a.length;i++)
						{
							System.out.print(seat.a[i]+" ");
						}
						System.out.println();
						System.out.print("�̸�>>");
						String name=sc.next();
						int isin=0;
						for(int i=0;i<seat.a.length;i++)
						{
							if(seat.a[i].equals(name))
							{
								seat.a[i]="---";
								isin=1;
								break;
							}
						}
						if(isin==0)
						{
							System.out.println("���� �̸��Դϴ�.");
						}
						else
						{
							break;
						}
					}
					else if(sit==3)
					{
						System.out.print("B>>");
						for(int i=0;i<seat.b.length;i++)
						{
							System.out.print(seat.b[i]+" ");
						}
						System.out.println();
						System.out.print("�̸�>>");
						String name=sc.next();
						int isin=0;
						for(int i=0;i<seat.b.length;i++)
						{
							if(seat.b[i].equals(name))
							{
								seat.b[i]="---";
								isin=1;
								break;
							}
						}
						if(isin==0)
						{
							System.out.println("���� �̸��Դϴ�.");
						}
						else
						{
							break;
						}
					}
					else
						System.out.println("���� �¼� �з��Դϴ�.");
					
			}
			
		}
			else
			{
				System.out.println("���� �޴��Դϴ�.");
			}
		
	}
	}
}
