package week3;

public class Pr10 {

	public static void main(String[] args) {
		
		int[][] a=new int[4][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=0;
			}
		}
		for(int i=0;i<10;i++)
		{
			int row;
			int col;
			do
			{
				row=(int)(Math.random()*4);
				col=(int)(Math.random()*4);
				
			}while(a[row][col]!=0);
			a[row][col]=(int)(1+Math.random()*10);
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
