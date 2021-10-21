package week6;

import java.io.InputStream;
import java.util.Scanner;

class Person2
{
	String name;
	int data[];
	
	Person2(String name)
	{
		this.name=name;
		data=new int[3];
	}
	
	void makeRandom()
	{
		for(int i=0;i<3;i++)
		{
			data[i]=1+(int)(Math.random()*3);
		}
	}
	
	int show()
	{
		System.out.print("   "+data[0]+" "+data[1]+" "+data[2]+" ");
		int ans=check();
		if(ans==0) {
			System.out.println("  아쉽군요!");
			return 0;
		}
		else
		{
			System.out.println(name+"님이 이겼습니다!");
			return 1;
		}
	}
	int check()
	{
		int ans=data[0];
		for(int i=1;i<3;i++)
		{
			if(ans!=data[i])
				return 0;
		}
		return 1;
	}
}
public class pr12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		int n=sc.nextInt();
		Person2[] p=new Person2[n];
		sc.nextLine();
		
		for(int i=0;i<p.length;i++)
		{
			System.out.print(i+1+"번째 선수 이름>>");
			String name=sc.nextLine();
			p[i]=new Person2(name);
		}
		
		int won=0;
		while(true)
		{
			for(int i=0;i<p.length;i++)
			{
				System.out.print("["+ p[i].name +"]:<Enter>");
				sc.nextLine();
				p[i].makeRandom();
				won=p[i].show();
				if(won==1)
					return;
			}
			
			
		}
		
	}

	private static void fflush(InputStream in) {
		// TODO Auto-generated method stub
		
	}
}
