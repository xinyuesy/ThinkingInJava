package chapter07;


class Component1
{
	Component1()
	{
		System.out.println("Component1 is constructed");
	}
	
	void dispose()
	{
		System.out.println("Component1 dispose");
	}
}
class Component2
{
	Component2()
	{
		System.out.println("Component2 is constructed");
	}
	void dispose()
	{
		System.out.println("Component2 dispose");
	}
}

class Component3
{
	Component3()
	{
		System.out.println("Component3 is constructed");
	}
	
	void dispose()
	{
		System.out.println("Component3 dispose");
	}
}
class Root
{
	private Component1 c1;
	private Component2 c2;
	private Component3 c3;
	
	Root()
	{
		c1= new Component1();
		c2= new Component2();
		c3= new Component3();
	}
	
	Component1 getC1()
	{
		return c1;
	}
	
	void dispose()
	{
		System.out.println("Root dispose");
		c3.dispose();
		c2.dispose();
		c1.dispose();
		
	}
}

public class Stem extends Root
{
	
	public void dispose()
	{
		System.out.println("Stem dispose");
		super.dispose();
	}
	public static void main(String[] args)
	{
		Stem s = new Stem();
		try
		{
			
		}
		finally
		{
			s.dispose();
		}
		System.out.println(s.getC1());
	}
}
