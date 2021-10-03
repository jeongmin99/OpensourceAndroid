package week4;

import java.util.Scanner;

class Phone
{
	String name;
	String tel;
	
	public Phone(String name,String tel)
	{
		this.name=name;
		this.tel=tel;
	}
	
}
public class Pr8 {

	public static void main(String[] args) {
		
		System.out.print("인원수>>");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Phone p[]=new Phone[n];
		for(int i=0;i<p.length;i++)
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name=sc.next();
			String tel=sc.next();
			p[i]=new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true)
		{
			String ctr;
			System.out.print("검색할 이름>>");
			ctr=sc.next();
			if(ctr.equals("그만"))
				break;
			int isin=0;
			for(int i=0;i<p.length;i++)
			{
				if(ctr.equals(p[i].name))
				{
					System.out.println(p[i].name+"의 번호는 "+p[i].tel+"입니다");
					isin=1;
					break;
				}
			}
			if(isin==0)
			{
				System.out.println(ctr+"이 없습니다");
			}
			
		}
	}
}
