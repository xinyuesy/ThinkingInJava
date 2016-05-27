package chapter06;

public class Mouse {
	int mouseNumber;
	
	public Mouse(int number)
	{
		mouseNumber = number;
	}
	
	public int getNumber()
	{
		return mouseNumber;
	}
	public static void main(String[] args)
	{
		ChocolateChip c = new ChocolateChip();
		c.makeCookie();
		//private 的不能访问
		//c.testPrivate();
		//在同一个包里面具有包访问权限的可以访问
		c.testPackage();
		//Protected 在继承类可以访问
		c.testProtected();
		//public都可以访问
		c.testPublic();
		Cookie cookie = new Cookie();
		//protected在同一个包内可以访问
		c.testProtected();
	}

}
