package week5;
interface Shape3
{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw()
	{
		System.out.print("---�ٽ� �׸��ϴ�. ");
		draw();
	}
}
class Circle3 implements Shape3
{
	int r;
	public Circle3(int r)
	{
		this.r=r;
	}
	public void draw()
	{
		System.out.println("�������� "+r+"�� ���Դϴ�.");
	}
	public double getArea()
	{
		return PI*r*r;
	}
}
class Oval implements Shape3
{
	int w;
	int h;
	public Oval(int w,int h)
	{
		this.w=w;
		this.h=h;
		
	}
	public void draw()
	{
		System.out.println(w+"x"+h+"�� �����ϴ� Ÿ���Դϴ�.");
	}
	public double getArea()
	{
		return w*h*PI;
	}
}
class Rect3 implements Shape3
{
	int w;
	int h;
	public Rect3(int w,int h)
	{
		this.w=w;
		this.h=h;
	}
	public void draw()
	{
		System.out.println(w+"x"+h+"ũ���� �簢�� �Դϴ�.");
	}
	public double getArea()
	{
		return w*h;
	}
}
public class Pr14 {

	public static void main(String[] args) {
		
		Shape3[] list=new Shape3[3];
		list[0]=new Circle3(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect3(10,40);
		
		for(int i=0;i<list.length;i++)
			list[i].redraw();
		for(int i=0;i<list.length;i++)
			System.out.println("������ "+list[i].getArea());
	}
}
