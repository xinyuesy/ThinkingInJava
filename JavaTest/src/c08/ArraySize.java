package c08;

class Weeble
{
}

public class ArraySize
{
	public static void main(String[] args)
	{
		Weeble[] a;
		Weeble[] b = new Weeble[5];
		Weeble[] c = new Weeble[4];
		int[] f = new int[10];
		int[] g;
		for (int i = 0; i < c.length; i++)
			c[i] = new Weeble();
		Weeble[] d =
		{ new Weeble(), new Weeble(), new Weeble() };
		a = c;
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		System.out.println(d.length);
		// System.out.println(g.length);

	}

}
