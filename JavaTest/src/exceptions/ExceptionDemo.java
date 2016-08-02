package exceptions;


class MyException1 extends Exception
{
	private String s;
	public MyException1(){}
	public MyException1(String s)
	{
		super(s);
		this.s = s;
	}
	public void print()
	{
		System.out.println(s);
	}
}
public class ExceptionDemo 
{
	public static void f() throws MyException1
	{
		throw new MyException1();
	}
	public static void g() throws MyException1
	{
		throw new MyException1("MyException");
	}
	public static void main(String[] args)
	{
		try
		{
			f();
		}catch(MyException1 e)
		{
			e.printStackTrace(System.out);
		}
		finally
		{
			System.out.println("finally of f()");
		}
		
		try
		{
			g();
		}catch(MyException1 e)
		{
			e.printStackTrace(System.out);
			e.print();
		}
		finally
		{
			System.out.println("finally of g()");
		}
	}
}
