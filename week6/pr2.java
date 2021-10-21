package week6;
class Circle
{
	int x;
	int y;
	int r;
	public Circle(int x,int y,int r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public boolean equals(Object obj)
	{
		Circle c=(Circle)obj;
		if(c.x==this.x && c.y==this.y)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return "Circle("+x+","+y+")������"+r;
	}
}
public class pr2 {

	public static void main(String[] args) {
		Circle a=new Circle(2,3,5);
		Circle b=new Circle(2,3,30);
		System.out.println("�� a: "+a);
		System.out.println("�� b: "+b);
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
