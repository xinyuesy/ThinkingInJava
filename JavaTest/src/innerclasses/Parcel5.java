package innerclasses;

/*public class Parcel5 
{
	private String name = "Verizon";
	private void print()
	{
		System.out.println(name);
	}
	public void printInner()
	{
		PContents p = new PContents();
		p.changeName("Sprint");
		p.value = 17;
		System.out.println("value: " + p.value);
	}
	protected class PContents implements Contents
	{
		private int value = 16;
		public int value() 
		{
			return value;
		}
		public void changeName(String n)
		{
			name = n;
			print();
		}
		
	}
	public static void main(String[] args)
	{
		Parcel5 p = new Parcel5();
		p.printInner();
	}

}*/

public class Parcel5
{
	public Destination destination(String s)
	{
		class PDestination implements Destination
		{
			private String label;
			private PDestination(String whereTo)
			{
				label = whereTo;
			}
			public String readLabel() { return label; }
		}
		return new PDestination(s);
	}
	public static void main(String[] args)
	{
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tasmania");
		System.out.println(d.readLabel());
	}
}
