package holding;

import java.util.ArrayList;
import java.util.Iterator;

class Rodent
{
	void print()
	{
		System.out.println("Rodent");
	}
	public String toString()
	{
		return "Rodent";
	}
}

class Mouse1 extends Rodent
{
	void print()
	{
		System.out.println("Mouse");
	}
	public String toString()
	{
		return "Mouse";
	}
}

class Gerbil1 extends Rodent
{
	void print()
	{
		System.out.println("Gerbil");
	}
	public String toString()
	{
		return "Gerbil";
	}
}

class Hamaster1 extends Rodent
{
	void print()
	{
		System.out.println("Hamaster");
	}
	public String toString()
	{
		return "Hamaster";
	}
}
public class TestRodent 
{
	public static void main(String[] args)
	{
		ArrayList<Rodent> rodent = new ArrayList<Rodent>();
		rodent.add(new Mouse1());
		rodent.add(new Gerbil1());
		rodent.add(new Hamaster1());
		Iterator<Rodent> it = rodent.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
