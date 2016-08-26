package debugoffpackage;

import chapter06.Cookie;

public class ChocolateChip extends Cookie
{
	ChocolateChip()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		ChocolateChip c = new ChocolateChip();
		c.makeCookie();
		c.testProtected();
		c.testPublic();
		// c.testPackage();
	}

}
