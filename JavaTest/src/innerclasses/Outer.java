package innerclasses;

public class Outer {
	class Inner
	{
		void print()
		{
			System.out.println("Inner");
		}
	}
	Inner getObject()
	{
		return new Inner();
	}
	public static void main(String[] args)
	{
		Outer o = new Outer();
		Outer.Inner i = o.getObject();
		i.print();
	}
}
