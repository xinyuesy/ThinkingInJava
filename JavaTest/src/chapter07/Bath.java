//这段代码演示了初始化的几个地方
//1.在定义对象的地方初始化
//2.在类的构造器中初始化
//3.在使用这些对象之前初始化,这种方式称为惰性初始化
//4.使用实例初始化
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
	//在定义的时候初始化
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
		//在构造函数中初始化
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	//在使用之前初始化
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
