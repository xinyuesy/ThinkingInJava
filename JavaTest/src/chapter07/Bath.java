//��δ�����ʾ�˳�ʼ���ļ����ط�
//1.�ڶ������ĵط���ʼ��
//2.����Ĺ������г�ʼ��
//3.��ʹ����Щ����֮ǰ��ʼ��,���ַ�ʽ��Ϊ���Գ�ʼ��
//4.ʹ��ʵ����ʼ��
package chapter07;
class Soap
{
	private  String s;
	Soap()
	{
		System.out.println("Soup()");
		s = "Constructed";
	}
	
	public String toString()
	{
		return s;
	}
	
}

public class Bath 
{
	//�ڶ����ʱ���ʼ��
	private String s1 = "Happy",
					s2 = "Happy",
					s3, s4;
	private Soap castille;
	private Soap a;
	private int i;
	private float toy;
	public Bath()
	{
		System.out.println("Inside Bath()");
		//�ڹ��캯���г�ʼ��
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	//��ʹ��֮ǰ��ʼ��
	{ i = 47; a = new Soap();}
	public String toString()
	{
		if(s4 == null)
			s4 = "Joy";
		return 
				"s1 = " + s1 + "\n" +
				"s2 = " + s2 + "\n" +
				"s3 = " + s3 + "\n" +
				"i = " + i + "\n" + 
				"toy = " + toy + "\n" +
				"castille = " + castille + "\n" + 
				"Soap a = " + a;
	}
	
	public static void main(String[] args)
	{
		Bath b = new Bath();
		System.out.println(b);
		//Soap a = new Soap();
	}
}
