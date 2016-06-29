package innerclasses;

public class ClassInterfaceImp implements ClassInInterface
{
	public static void main(String[] args)
	{
		ClassInterfaceImp c = new ClassInterfaceImp();
		c.howdy();
		ClassInterfaceImp.Test t = new ClassInterfaceImp.Test();
		ClassInterfaceImp.Test.print(c);
		ClassInterfaceImp.Test.howdy();

	}

	public void howdy() 
	{
		System.out.println("howdy");
	}
}
