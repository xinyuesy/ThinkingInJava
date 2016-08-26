package generics;

class Automobile {}

public class Holder1
{
	private Automobile a;
	public Holder1(Automobile a) { this.a = a; }
	Automobile get() { return a; }
	
	public static void main(String[] args)
	{
		Holder1 h = new Holder1(new Automobile());
		System.out.println(h.get());
	}
}
