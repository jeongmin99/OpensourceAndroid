package week4;
import java.util.Scanner;
class Book3
{
	String title,author;
	public Book3(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
}
public class BookArray {

	public static void main(String[] args) {
		Book3[] book=new Book3[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<book.length;i++)
		{
			System.out.print("����>>");
			String title=sc.nextLine();
			System.out.print("����>>");
			String author=sc.nextLine();
			book[i]=new Book3(title, author);
		}
		for(int i=0;i<book.length;i++)
			System.out.print("("+book[i].title+", "+book[i].author+")");
		sc.close();
	}
}
