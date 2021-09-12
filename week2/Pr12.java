package week2;
import java.util.*;
public class Pr12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String op;
		float opr1;
		float opr2;
		System.out.print("연산>>");
		opr1=sc.nextFloat();
		op=sc.next();
		opr2=sc.nextFloat();
		
		if(op.equals("+"))
		{
			float sum1=opr1+opr2;
			System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum1);
		}
		else if(op.equals("-"))
		{
			float sum2=opr1-opr2;
			System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum2);
		}
		else if(op.equals("*"))
		{
			float sum3=opr1*opr2;
			System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum3);
		}
		else
		{
			if(opr2==0)
			{
				System.out.println("0으로 나눌수 없음");
			}
			else
			{
				float sum4=opr1/opr2;
				System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum4);
			}
		}
		/*switch(op)
		{
			case "+":
			{
				float sum1=opr1+opr2;
				System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum1);
				break;
			}
			case "-":
			{
				float sum2=opr1-opr2;
				System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum2);
				break;
			}
			case "*":
			{
				float sum3=opr1*opr2;
				System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum3);
				break;
			}
			default:
			{
				if(opr2==0)
				{
					System.out.println("0으로 나눌수 없음");
				}
				else
				{
					float sum4=opr1/opr2;
					System.out.println((int)opr1+op+(int)opr2+" 계산의 결과는 "+(int)sum4);
				}
				break;
			}
				
		}*/
	}
}
