package innerclasses;

class Tomato
{
	protected String name;

	Tomato(String name)
	{
		this.name = name;
	}

	void print()
	{
	}
}

class Salad
{
	public Tomato myTomato()
	{
		return new Tomato("Cherry Tomato")
		{
			void print()
			{
				System.out.println(name);
			}
		};
	}
}

public class TestVegetable
{
	public static void main(String[] args)
	{
		Salad s = new Salad();
		s.myTomato().print();
	}

}
