package exceptions;

class Vegetable
{
	void print()
	{
		System.out.println("I love vegetable");
	}
}

public class ExceptionDemo1 
{
	public static void main(String[] args)
	{
		Vegetable v = new Vegetable();
		Vegetable v1 = null;
		//v1.print();
		try
		{
			v1.print();
		}catch(NullPointerException e)
		{
			e.printStackTrace(System.out);
		}
		
	}
}
