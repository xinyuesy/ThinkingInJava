package chapter08;

class Fruit
{
	public void print()
	{
		System.out.println("Fruit " + name());
	}
	public static String name()
	{
		return "Fruit";
	}
}
class Apple extends Fruit
{
	public void print()
	{
		System.out.println("Apple " + name());
	}
	
	public static String name()
	{
		return "Apple";
	}
}
public class TestFruit {
	
	public static void main(String[] args)
	{
		Fruit f = new Apple();
		f.print();
	}

}
