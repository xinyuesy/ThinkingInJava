package innerclasses;

//Ç¶Ì×ÄÚ²¿Àà
public class Parcel11
{
	static int y = 5;

	private static class ParcelContents implements Contents
	{
		private int i = y;

		public int value()
		{
			return i;
		}
	}

	protected static class ParcelDestination implements Destination
	{
		private String label;

		private ParcelDestination(String whereTo)
		{
			label = whereTo;
		}

		public String readLabel()
		{
			return label;
		}

		public static void f()
		{
		}

		static int x = 10;

		static class AnotherLevel
		{
			public static void f()
			{
			}

			static int x = 10;
		}
	}

	public static Destination destination(String s)
	{
		return new ParcelDestination(s);
	}

	public static Contents contents()
	{
		return new ParcelContents();
	}

	public static void main(String[] args)
	{
		Contents c = contents();
		Destination d = destination("Tasmania");
		System.out.println(c.value());
		ParcelDestination.AnotherLevel.f();
		System.out.println(d.readLabel());
		Parcel11.ParcelContents p = new Parcel11.ParcelContents();
		System.out.println(p.value());
	}
}
