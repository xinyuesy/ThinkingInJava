package chapter08;

interface FastFood
{
	int energy();
}

class Meal
{
	Meal()
	{
		System.out.println("Meal()");
	}
}

class Bread
{
	Bread()
	{
		System.out.println("Bread()");
	}
}

class Cheese
{
	Cheese()
	{
		System.out.println("Cheese()");
	}
}

class Lettuce
{
	Lettuce()
	{
		System.out.println("Lettuce()");
	}
}

class Pickle
{
	Pickle()
	{
		System.out.println("Pickle()");
	}
}

class Lunch extends Meal
{
	Lunch()
	{
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch
{
	PortableLunch()
	{
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch implements FastFood
{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();

	public Sandwich()
	{
		System.out.println("Sandwich()");
	}

	public static void main(String[] args)
	{
		Sandwich s = new Sandwich();
		System.out.println(s.energy());
	}

	public int energy()
	{

		return 1530;
	}
}
