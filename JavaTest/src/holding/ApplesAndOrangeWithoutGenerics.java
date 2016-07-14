package holding;

import java.util.ArrayList;

class Apple
{
	private static long counter;
	private final long id = counter++;
	public long id() { return id; }
}

class Orange 
{
	void print(){ System.out.println("Orange"); }
}

public class ApplesAndOrangeWithoutGenerics 
{
	public static void main(String[] args)
	{
		ArrayList<Apple> apples = new ArrayList();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		//apples.add(new Orange());
		for(int i = 0; i < apples.size(); i++)
		{
			try
			{
				((Apple)apples.get(i)).id();
			}
			catch(ClassCastException e)
			{
				//((Orange)apples.get(i)).print();
			}
		}
		//System.out.println(((Apple)apples.get(2)).id());
		for(int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
		for(Apple c : apples)
			System.out.println(c.id());
	}
}
