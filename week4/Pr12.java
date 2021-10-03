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
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true)
		{
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int n=sc.nextInt();
			if(n==4)
				break;
			else if(n==1)
			{
				while(true) {
					System.out.print("좌석구분 S(1), A(2), B(3)>>");
					int sit=sc.nextInt();
					if(sit==1)
					{
						System.out.print("S>>");
						for(int i=0;i<seat.s.length;i++)
						{
							System.out.print(seat.s[i]+" ");
						}
						System.out.println();
						System.out.print("이름>>");
						String name=sc.next();
						System.out.print("번호>>");
						int num=sc.nextInt();
						if(!seat.s[num-1].equals("---"))
							System.out.println("이미 예약된 자리입니다.");
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
						System.out.print("이름>>");
						String name=sc.next();
						System.out.print("번호>>");
						int num=sc.nextInt();
						if(!seat.a[num-1].equals("---"))
							System.out.println("이미 예약된 자리입니다.");
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
						System.out.print("이름>>");
						String name=sc.next();
						System.out.print("번호>>");
						int num=sc.nextInt();
						if(!seat.b[num-1].equals("---"))
							System.out.println("이미 예약된 자리입니다.");
						else
						{
							seat.b[num-1]=name;
							break;
						}
					}
					else
						System.out.println("잘못된 번호입니다.");
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
				System.out.println("<<<조회를 완료하였습니다.>>>");
			}
			else if(n==3)
			{
				while(true) {
					System.out.print("좌석 S:1, A:2, B:3>>");
					int sit=sc.nextInt();
				
					if(sit==1)
					{
						System.out.print("S>>");
						for(int i=0;i<seat.s.length;i++)
						{
							System.out.print(seat.s[i]+" ");
						}
						System.out.println();
						System.out.print("이름>>");
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
							System.out.println("없는 이름입니다.");
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
						System.out.print("이름>>");
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
							System.out.println("없는 이름입니다.");
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
						System.out.print("이름>>");
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
							System.out.println("없는 이름입니다.");
						}
						else
						{
							break;
						}
					}
					else
						System.out.println("없는 좌석 분류입니다.");
					
			}
			
		}
			else
			{
				System.out.println("없는 메뉴입니다.");
			}
		
	}
	}
}
