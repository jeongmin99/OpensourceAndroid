package week5;

import java.util.Scanner;

abstract class Shape2
{
	private Shape2 next;
	public Shape2()
	{
		next=null;
	}
	public void setNext(Shape2 obj)
	{
		next=obj;
	}
	public Shape2 getNext()
	{
		return next;
	}
	public abstract void draw();
}
class Line2 extends Shape2
{
	public void draw()
	{
		System.out.println("Line");
	}
}
class Rect2 extends Shape2
{
	public void draw()
	{
		System.out.println("Rect");
	}
}
class Circle2 extends Shape2
{
	public void draw()
	{
		System.out.println("Circle");
	}
}
public class Pr12 {
	public static void main(String[] args) {
		int size=0;
		Shape2 head=null;
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int m=sc.nextInt();
				if(m==1)
				{
					if(head==null)
					{
						Line2 l=new Line2();
						head=l;
					}
					else
					{
						Shape2 cur=head;
						while(cur.getNext()!=null)
						{
							cur=cur.getNext();
						}
						Line2 l=new Line2();
						cur.setNext(l);
					}
					
				}
				else if(m==2)
				{
					if(head==null)
					{
						Rect2 r=new Rect2();
						head=r;
					}
					else
					{
						Shape2 cur=head;
						while(cur.getNext()!=null)
						{
							cur=cur.getNext();
						}
						Rect2 r=new Rect2();
						cur.setNext(r);
					}
				}
				else if(m==3)
				{
					if(head==null)
					{
						Circle2 c=new Circle2();
						head=c;
					}
					else
					{
						Shape2 cur=head;
						while(cur.getNext()!=null)
						{
							cur=cur.getNext();
						}
						Circle2 c=new Circle2();
						cur.setNext(c);
					}
				}
				else
				{
					System.out.println("잘못된 메뉴");
				}
			}
			else if(n==2)
			{
				System.out.print("삭제할 도형의 위치>>");
				int c=sc.nextInt();
				int check=1;
				Shape2 cur=head;
				Shape2 prev=null;
				while(check<c && cur.getNext()!=null)
				{
					prev=cur;
					cur=cur.getNext();
					check++;
				}
				if(check!=c)
					System.out.println("삭제할 수 없습니다");
				else
				{
					prev.setNext(cur.getNext());
				}
			}
			else if(n==3)
			{
				Shape2 cur=head;
				while(cur!=null)
				{
					cur.draw();
					cur=cur.getNext();
				}
			}
			else if(n==4)
			{
				System.out.println("beauty을 종료합니다");
				break;
			}
			else
			{
				System.out.println("잘못된 메뉴입니다");
			}
			
		}
	}

}
