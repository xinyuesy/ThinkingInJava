package interfaces;

interface Cycle
{
	void riding();
}
interface CycleFactory
{
	Cycle getCycle();
}
class Unicycle implements Cycle
{
	public void riding() { System.out.println("Unicycle.riding()"); }
}

class UnicycleFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Unicycle();
	}
}
class Bicycle implements Cycle
{
	public void riding() { System.out.println("Bicycle.riding()"); }
}

class BicycleFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Bicycle();
	}
}

class Tricycle implements Cycle
{
	public void riding() { System.out.println("Tricycle.riding()"); }
}

class TricycleFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Tricycle();
	}
}


public class CycleTest 
{
	public static void ride(CycleFactory factory)
	{
		Cycle c = factory.getCycle();
		c.riding();
	}
	public static void main(String[] args)
	{
		ride(new UnicycleFactory());
		ride(new BicycleFactory());
		ride(new TricycleFactory());
	}

}
