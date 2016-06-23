package innerclasses;

public class Parcel3 
{
	class Contents
	{
		private int i = 11;
		public int value() { return i; }
		public String toString() { return "Contents"; }
	}
	
	class Destination
	{
		private String label;
		Destination(String whereTo) { label = whereTo; }
		String readLabel() { return label; }
	}
	static class Test
	{
		public String toString() { return "Test"; }
	}
	public static void main(String[] args)
	{
		Parcel3 p = new Parcel3();
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Tasmania");
		System.out.println(d.readLabel());
		Parcel3.Test t = new Parcel3.Test();
		System.out.println(t.toString());
		Test1 t1 = new Test1();
		t1.print();
		
	}
}
class Test1
{
	Test1()
	{
		
	}
	void print()
	{
		Parcel3 p = new Parcel3();
		Parcel3.Contents c = p.new Contents();
		System.out.println(c.toString());
	}
}