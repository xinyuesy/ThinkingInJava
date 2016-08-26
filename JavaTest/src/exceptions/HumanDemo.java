package exceptions;

class A extends Exception
{
}

class B extends A
{
}

class C extends B
{
}

public class HumanDemo
{
	public static void main(String[] args)
	{
		try
		{
			A c = new C();
			throw c;
		} catch (C c)
		{
			System.out.println("A exception");
		} catch (B b)
		{
			System.out.println("B exception");
		} catch (A a)
		{
			System.out.println("A exception");
		}
	}
}
