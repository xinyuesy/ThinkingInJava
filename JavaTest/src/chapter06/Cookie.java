package chapter06;

public class Cookie
{

	protected Cookie()
	{
		System.out.println("Cookie is constructed");
	}

	private void testPrivate()
	{
		System.out.println("test private");
	}

	void testPackage()
	{
		System.out.println("test package");
	}

	protected void testProtected()
	{
		System.out.println("test protected");
	}

	protected void makeCookie()
	{
		System.out.println("Make cookie");
	}

	public void testPublic()
	{
		System.out.println("test public");
	}

}
