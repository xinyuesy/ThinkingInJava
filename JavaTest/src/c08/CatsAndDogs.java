package c08;

import java.util.*;

class Cat
{
	private int catNumber;

	Cat(int i)
	{
		catNumber = i;
	}

	void print()
	{
		System.out.println("Cat #" + catNumber);
	}
}

class Dog
{
	private int dogNumber;

	Dog(int i)
	{
		dogNumber = i;
	}

	void print()
	{
		System.out.println("Dog #" + dogNumber);
	}
}

public class CatsAndDogs
{
	public static void main(String[] args)
	{
		Vector cats = new Vector();
		for (int i = 0; i < 7; i++)
			cats.addElement(new Dog(i));
		cats.addElement(new Dog(7));
		for (int i = 0; i < cats.size(); i++)
			((Cat) cats.elementAt(i)).print();
		// for(int i = 0; i < cat.size(); i++)

	}

}
