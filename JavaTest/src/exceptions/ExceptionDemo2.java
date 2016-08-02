package exceptions;

import java.util.Random;

class Exception1 extends Exception
{
	Exception1(String s)
	{
		super(s);
	}
}

class Exception2 extends Exception
{
	Exception2(String s)
	{
		super(s);
	}
}
class Exception3 extends Exception
{
	Exception3(String s)
	{
		super(s);
	}
}
public class ExceptionDemo2 
{
	public static void f() throws Exception1, Exception2, Exception3
	{

		Random rand = new Random(System.currentTimeMillis());
		int a = rand.nextInt(4);
		if(a==0)
			throw new Exception1("Exception1");
		if(a==1)
			throw new Exception2("Exception2");
		if(a==2)
			throw new Exception3("Exception3");
		if(a==3)
			throw new NullPointerException();
	}
	public static void main(String[] args)
	{
		try
		{
			f();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		} finally
		{
			System.out.println("finally");
		}
	}
}
