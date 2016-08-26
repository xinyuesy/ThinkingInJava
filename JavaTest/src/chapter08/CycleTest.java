package chapter08;

//��̬��/���ڰ�
class Cycle
{
	public void ride(Cycle c)
	{
		System.out.println("Cycle.ride() " + c.wheels());
	}

	public int wheels()
	{
		return 0;
	}

}

class Unicycle extends Cycle
{
	@Override
	public void ride(Cycle c)
	{
		System.out.println("Unicycle.ride() " + c.wheels());
	}

	@Override
	public int wheels()
	{
		return 1;
	}

}

class Bicycle extends Cycle
{
	public void ride(Cycle c)
	{
		System.out.println("Bicycle.ride() " + c.wheels());
	}

	@Override
	public int wheels()
	{
		return 2;
	}

	void balance()
	{
		System.out.println("Bicycle.balance()");
	}
}

class Tricycle extends Cycle
{
	public void ride(Cycle c)
	{
		System.out.println("Tricycle.ride() " + c.wheels());
	}

	@Override
	public int wheels()
	{
		return 3;
	}

	void balance()
	{
		System.out.println("Unicycle.balance()");
	}
}

public class CycleTest
{
	public static void riding(Cycle c)
	{
		c.ride(c);
	}

	public static void main(String[] args)
	{
		Unicycle uc = new Unicycle();
		riding(uc);
		Bicycle bc = new Bicycle();
		riding(bc);
		Tricycle tc = new Tricycle();
		riding(tc);

		Cycle a = new Unicycle();
		// ((Bicycle) a).balance();
		a = new Bicycle();
		((Bicycle) a).balance();
		a = new Tricycle();
		((Tricycle) a).balance();
	}
}