package chapter07;

class Insect
{
	private int i = 9;
	protected int j;
	Insect()
	{
		System.out.println("i = " + i + " , j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s)
	{
		System.out.println(s);
		return 47;
	}
}
public class Beetle extends Insect
{
	//private int k = printInit("Beetle.k initialized");
	int k = 1;
	int j = 5;
	private static int a = print();
	static int  print()
	{
		System.out.println("static variable initialized");
		return 5;
	}
	public Beetle()
	{
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	//private static int x2 =
	//		printInit("static Beetle.x2 initialized");
	public static void main(String[] args)
	{
		System.out.println("Beetle constructor");
		//Beetle b = new Beetle();
		Insect.printInit("test");
		
		Insect.printInit("test1");
	}
}

class Beetles extends Beetle
{
	private static int b = printInit("static Beetles.b initialized");
	public static void main(String[] args)
	{
		
	}
}