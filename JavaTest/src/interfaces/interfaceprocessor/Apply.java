package interfaces.interfaceprocessor;

public class Apply {
	public static void process(Process p, Object s)

	{
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}
