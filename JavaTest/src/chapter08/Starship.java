package chapter08;

class AlertStatus
{
	void print()
	{
		System.out.println("AlertStatus");
	}
}

class Error extends AlertStatus
{
	void print()
	{
		System.out.println("Error");
	}
}

class Warning extends AlertStatus
{
	void print()
	{
		System.out.println("Warning");
	}
}

class Info extends AlertStatus
{
	void print()
	{
		System.out.println("Info");
	}

	void notice()
	{
		System.out.println("Info notice");
	}
}

public class Starship
{
	public static void main(String[] args)
	{
		AlertStatus a = new Error();
		a.print();
		a = new Warning();
		a.print();
		a = new Info();
		a.print();
		// a.notice();
	}
}
