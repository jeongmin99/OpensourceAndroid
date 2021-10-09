package week5;
class TV
{
	private int size;
	public TV(int size)
	{
		this.size=size;
	}
	protected int getSize()
	{
		return size;
	}
}
class ColorTV extends TV
{
	private int color;
	public ColorTV(int size,int color)
	{
		super(size);
		this.color=color;
	}
	public int getColor()
	{
		return this.color;
	}
	public void printProperty()
	{
		System.out.println(this.getSize()+"��ġ "+this.color+"�÷�");
	}
}
class IPTV extends ColorTV
{
	String ip;
	public IPTV(String ip,int size,int color)
	{
		super(size,color);
		this.ip=ip;
	}
	public void printProperty()
	{
		System.out.println("���� IPTV�� "+this.ip+" �ּ��� "+this.getSize()+"��ġ "+this.getColor()+"�÷�");
	}
}
public class Pr2 {

	public static void main(String[] args) {
		
		IPTV iptv=new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
