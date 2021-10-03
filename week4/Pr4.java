package week4;

class Rectangles
{
	int x;
	int y;
	int width;
	int height;
	public Rectangles(int x,int y,int width,int height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	public void show()
	{
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	public int square()
	{
		return this.width*this.height;
	}
	public boolean contains(Rectangles r)
	{
		if(this.x<r.x && this.y<r.y && this.x+this.width>r.x+r.width && this.y+this.height>r.y+r.height)
		{
			return true;
		}
		else
			return false;
	}
}
public class Pr4 {

	public static void main(String[] args) {
		
		Rectangles r=new Rectangles(2,2,8,7);
		Rectangles s=new Rectangles(5,5,6,6);
		Rectangles t=new Rectangles(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
