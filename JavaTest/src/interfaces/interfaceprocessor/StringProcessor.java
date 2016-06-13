package interfaces.interfaceprocessor;

public class StringProcessor implements Processor
{
	public String name()
	{
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s = 
}
