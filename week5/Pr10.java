package week5;

abstract class PairMap
{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap
{
	private int length;
	int size;
	public Dictionary(int size)
	{
		keyArray=new String[size];
		valueArray=new String[size];
		this.size=size;
		length=0;
	}
	public void put(String key, String value)
	{
		for(int i=0;i<size;i++)
		{
			if(keyArray[i]==null || keyArray[i].equals(key))
			{
				keyArray[i]=key;
				valueArray[i]=value;
				break;
			}
		}
	}
	public String get(String key)
	{
		for(int i=0;i<size;i++)
		{
			if(keyArray[i]!=null && keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}
	public String delete(String key)
	{
		for(int i=0;i<size;i++)
		{
			if(keyArray[i]!=null && keyArray[i].equals(key))
			{
				keyArray[i]=null;
				String retvalue=valueArray[i];
				valueArray[i]=null;
				return retvalue;
			}
		}
		return null;
	}
	public int length()
	{
		return this.length;
	}
}
public class Pr10 {
	public static void main(String[] args) {
		Dictionary dic=new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문","C++");
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
	}

}
