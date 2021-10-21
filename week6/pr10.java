package week6;

import java.util.Scanner;

class Person
{
	String name;
	int data[];
	
	Person(String name)
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
public class pr10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name=sc.nextLine();
		Person p1=new Person(name);
		System.out.print("2번째 선수 이름>>");
		name=sc.nextLine();
		Person p2=new Person(name);
		int won=0;
		while(true)
		{
			System.out.print("["+p1.name+"]:<Enter>");
			sc.nextLine();
			p1.makeRandom();
			won=p1.show();
			if(won==1)
				break;
			System.out.print("["+p2.name+"]:<Enter>");
			sc.nextLine();
			p2.makeRandom();
			won=p2.show();
			if(won==1)
				break;
			
		}
		
	}
}
