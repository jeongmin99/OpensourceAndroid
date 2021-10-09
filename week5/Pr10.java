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
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮","C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	}

}
