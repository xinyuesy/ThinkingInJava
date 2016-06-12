package chapter08;

class Rodent
{
	Rodent()
	{
		System.out.println("Rodent()");
	}
	public void print() { System.out.println("Rodent"); }
}


class Mouse extends Rodent
{
	Mouse()
	{
		System.out.println("Mouse()");
	}
	public void print() { System.out.println("Mouse"); }
}

class Gerbil extends Rodent
{
	Gerbil()
	{
		System.out.println("Gerbil()");
	}
	public void print() { System.out.println("Gerbil"); }
}

class Hamaster extends Rodent
{
	Hamaster()
	{
		System.out.println("Hamaster()");
	}
	public void print() { System.out.println("Hamaster"); }
}
public class TestRodent {
	public static void main(String[] args)
	{
		Rodent[] r = {
				new Mouse(),
				new Gerbil(),
				new Hamaster()
		};
		for(int i = 0; i < r.length; i++)
			r[i].print();
	}

}
