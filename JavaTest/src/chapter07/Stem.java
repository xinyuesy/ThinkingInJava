package chapter07;


class Component1
{
	Component1()
	{
		System.out.println("Component1 is constructed");
	}
}
class Component2
{
	Component2()
	{
		System.out.println("Component2 is constructed");
	}
}

class Component3
{
	Component3()
	{
		System.out.println("Component3 is constructed");
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
}

public class Stem extends Root
{
	public static void main(String[] args)
	{
		Stem s = new Stem();
		System.out.println(s.getC1());
	}
}
