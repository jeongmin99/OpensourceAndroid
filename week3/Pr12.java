package week3;

public class Pr12 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			int isdigit=1;
			for(int j=0;j<args[i].length();j++)
			{
				if(!('0'<=args[i].charAt(j) && args[i].charAt(j)<='9'))
				{
					isdigit=0;
					break;
				}
			}
			if(isdigit==1)
			{
				sum+=Integer.parseInt(args[i]);
			}
		}
		
		System.out.println(sum);
	}
}
