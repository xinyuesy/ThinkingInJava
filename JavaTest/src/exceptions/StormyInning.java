package exceptions;


class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
abstract class Inning
{
	public Inning() throws BaseballException {}
	public void event() throws BaseballException {}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}
class UmpireArgument extends Exception {}

interface Storm
{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}
public class StormyInning extends Inning implements Storm
{
	public StormyInning() throws RainedOut, BaseballException {}
	public StormyInning(String s) throws Foul, BaseballException {}
	public void rainHard() throws RainedOut {}
	public void event() {}
	public void atBat() throws PopFoul {}
	public void test() throws UmpireArgument {}
	//public void walk() throws PopFoul {} 
	public static void main(String[] args)
	{
		try
		{
			StormyInning si = new StormyInning();
			si.atBat();
			si.test();
			//si.walk();
		} catch(PopFoul e)
		{
			System.out.println("Pop foul");
		} catch(RainedOut e)
		{
			System.out.println("Rained out");
		} catch(BaseballException e)
		{
			System.out.println("Generic baseball exception");
		} catch(UmpireArgument e)
		{
			System.out.println("UmpireArgument");
		}
		try
		{
			Inning i = new StormyInning();
			i.atBat();
		} catch(Strike e)
		{
			System.out.println("Strike");
		} catch(RainedOut e)
		{
			System.out.println("Rained out");
		} catch(BaseballException e)
		{
			System.out.println("Generic baseball exception");
		}
	}
}
