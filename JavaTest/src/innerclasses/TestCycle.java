package innerclasses;

interface Cycle
{
	void print();
}


interface CycleFactory
{
	Cycle getCycle();
}

class Unicycle implements Cycle
{
	public static CycleFactory fact = new CycleFactory()
			{

				public Cycle getCycle() {
					return new Unicycle();
				}
				
			};
	public void print() { System.out.println("Unicycle"); }
}
class Bicycle implements Cycle
{
	public static CycleFactory fact = new CycleFactory()
			{
				public Cycle getCycle()
				{
					return new Bicycle();
				}
			};
	public void print() { System.out.println("Bicycle"); }

}

class Tricycle implements Cycle
{
	public static CycleFactory fact = new CycleFactory()
			{
				public Cycle getCycle()
				{
					return new Tricycle();
				}
			};
	public void print() { System.out.println("Tricycle"); }

}
public class TestCycle 
{
	public static void switchCycle(CycleFactory fact)
	{
		Cycle s = fact.getCycle();
		s.print();
		
	}
	public static void main(String[] args)
	{
		switchCycle(Unicycle.fact);
		switchCycle(Bicycle.fact);
		switchCycle(Tricycle.fact);
	}
}
