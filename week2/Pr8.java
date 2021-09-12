package week2;
import java.util.*;
public class Pr8 {

	public static void main(String[] args) {
		
		int x1,y1,x2,y2;
		Scanner sc=new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		if(((x1>=100 && x1<=200)&&(y1>=100 && y1<=200)) || ((x2>=100 && x2<=200) && (y2>=100 && y2<=200)))
		{
			System.out.println("Ãæµ¹");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
