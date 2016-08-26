package interfaces;

/*abstract class AbstractTest
{
	abstract void print();
	AbstractTest()
	{
		print();
	}
}

class AbstractHerit extends AbstractTest
{
	private int value = 10;
	void print()
	{
		System.out.println("The value is: " + value);
	}
}
public  class AbstractClass 
{
	public static void main(String[] args)
	{
		AbstractHerit a = new AbstractHerit();
		a.print();
	}
}*/

//output
//The value is: 0
//The value is: 10

abstract class AbstractTest
{
	abstract void print();
}

class AbstractHerit extends AbstractTest
{
	private int value = 10;

	public static void walking()
	{
		System.out.println("I'm walking");
	}

	void print()
	{
		System.out.println("The value is: " + value);
	}
}

public class AbstractClass
{
	public static void main(String[] args)
	{
		AbstractTest a = new AbstractHerit();
		a.print();
		AbstractHerit.walking();
	}
}