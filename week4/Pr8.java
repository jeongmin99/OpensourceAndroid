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
		
		System.out.print("�ο���>>");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Phone p[]=new Phone[n];
		for(int i=0;i<p.length;i++)
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
			String name=sc.next();
			String tel=sc.next();
			p[i]=new Phone(name,tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while(true)
		{
			String ctr;
			System.out.print("�˻��� �̸�>>");
			ctr=sc.next();
			if(ctr.equals("�׸�"))
				break;
			int isin=0;
			for(int i=0;i<p.length;i++)
			{
				if(ctr.equals(p[i].name))
				{
					System.out.println(p[i].name+"�� ��ȣ�� "+p[i].tel+"�Դϴ�");
					isin=1;
					break;
				}
			}
			if(isin==0)
			{
				System.out.println(ctr+"�� �����ϴ�");
			}
			
		}
	}
}
