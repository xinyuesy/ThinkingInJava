package exceptions;

class Exception4 extends Exception {}
class Exception5 extends Exception {}
public class ExceptionDemo3 
{
	public static void f() throws Exception5
	{
		try
		{
			g();
		} catch(Exception4 e)
		{
			System.out.println("Exception4");
			e.printStackTrace(System.out);
			//throw RuntimeException(new Exception5());
			//throw new Exception5();
			throw new RuntimeException(e);
		}
	}
	public static void g() throws Exception4
	{
		System.out.println("g()");
		throw new Exception4();
	}
	public static void main(String[] args)
	{
		try
		{
			f();
			
		} catch (Exception5 e) {
			System.out.println("Exception5");
			e.printStackTrace(System.out);
		} catch (RuntimeException e)
		{
			System.out.println("RuntimeException");
			e.printStackTrace(System.out);;
		}
	}
}
