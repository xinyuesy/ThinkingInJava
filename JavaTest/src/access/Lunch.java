package access;

class Soup1
{
	private Soup1()
	{
	}

	public static Soup1 makeSoup()
	{
		return new Soup1();
	}
}

class Soup2
{
	private int count = 0;

	private Soup2()
	{
		count = (int) (Math.random() * 100);
	}

	private static Soup2 ps1 = new Soup2();

	public static Soup2 access()
	{
		return ps1;
	}

	public void f()
	{
		System.out.println("Soup2->f() is called");
	}

	public int getCount()
	{
		return count;
	}
}

class Soup3
{
	static int test;
	private int count;

	Soup3()
	{
		count = (int) (Math.random() * 100);
	}

	int getCount()
	{
		return count;
	}
}

public class Lunch
{
	void testPrivate()
	{
		// Soup1 soup = new Soup1();
	}

	void testStatic()
	{
		Soup1 soup = Soup1.makeSoup();
	}

	void testSingleton()
	{
		Soup2.access().f();
	}

	public static void main(String[] args)
	{
		Lunch lunch = new Lunch();
		lunch.testSingleton();
		// Soup1 soup = new Soup1();
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Soup2.access() + "\t" + Soup2.access().getCount());
		}
		for (int i = 0; i < 10; i++)
		{
			Soup3 s3 = new Soup3();
			System.out.println(s3 + "\t" + s3.getCount());
			// System.out.println(s3.test);
		}

		PackagedClass pc = new PackagedClass();

	}

}
