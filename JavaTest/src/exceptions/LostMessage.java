package exceptions;

class VeryImportantException extends Exception
{
	public String toString()
	{
		return "A very important exception!";
	}
}

class HoHumException extends Exception
{
	public String toString()
	{
		return "A trivial exception";
	}
}

class RainException extends Exception
{
	public String toString()
	{
		return "A raining exception";
	}
}

public class LostMessage
{
	void f() throws VeryImportantException
	{
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException
	{
		throw new HoHumException();
	}

	void rain() throws RainException
	{
		throw new RainException();
	}

	public static void main(String[] args)
	{
		try
		{
			LostMessage lm = new LostMessage();
			try
			{

				try
				{
					lm.f();
				} finally
				{
					lm.dispose();
					return;
				}
			} finally
			{
				lm.rain();
				return;
			}
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
