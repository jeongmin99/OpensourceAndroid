package week4;

import java.util.Scanner;

class Circles
{
	private double x,y;
	private int radius;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circles(double x,double y,int radius)
	{
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
}
public class Pr6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Circles c[]=new Circles[3];
		for(int i=0;i<c.length;i++)
		{
			System.out.print("x, y, radius >>");
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			int radius=sc.nextInt();
			c[i]=new Circles(x,y,radius);
				
		}
		Circles max=null;
		for(int i=0;i<c.length;i++)
		{
			if(max==null)
			{
				max=c[i];
			}
			else
			{
				if(max.getRadius()<c[i].getRadius())
					max=c[i];
			}
		}
		System.out.println("���� ������ ū ���� ("+max.getX()+","+max.getY()+")"+max.getRadius());
	}

}
