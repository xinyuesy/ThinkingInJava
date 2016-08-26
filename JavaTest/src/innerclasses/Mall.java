package innerclasses;

import java.util.Random;

public class Mall
{

	private class Starbucks implements CoffeeShop
	{

		public void drinking()
		{
			System.out.println("Drinking coffee in starbucks");
		}

	}

	CoffeeShop drinkingStarbucks()
	{
		return new Starbucks();
	}

	CoffeeShop drinkingMccoffee()
	{
		return new CoffeeShop()
		{
			public void drinking()
			{
				System.out.println("Drinking coffee in Mcdonalds");
			}
		};
	}

	CoffeeShop cate()
	{
		Random rand = new Random(System.currentTimeMillis());
		if (rand.nextBoolean())
		{
			class Coffee implements CoffeeShop
			{

				public void drinking()
				{
					System.out.println("Drinking coffee in this mall");
				}
			}
			return new Coffee();
		} else
		{
			class Costa implements CoffeeShop
			{
				public void drinking()
				{
					System.out.println("Drinking coffee in costa");
				}
			}
			return new Costa();
		}

	}

	public static void main(String[] args)
	{
		Mall m = new Mall();
		m.cate().drinking();
		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < 10; i++)
		{
			System.out.println(rand.nextBoolean());
			// sleep(1000);
		}
		m.drinkingStarbucks().drinking();
		BHG b = new BHG();
		b.drinkingMccoffee().drinking();
		// BHG.Starbucks s = b.new Starbucks();

	}
}

class BHG extends Mall
{
	void print()
	{
		System.out.println("This is BHG mall");
	}
}
