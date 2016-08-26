package holding;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerbil
{
	private int gerbilNumber;
	private static int number;

	Gerbil()
	{
		gerbilNumber = number++;
	}

	void hop()
	{
		System.out.println(gerbilNumber);
	}

	public static void main(String[] args)
	{
		ArrayList<Gerbil> gerbil = new ArrayList<Gerbil>();

		for (int i = 0; i < 5; i++)
			gerbil.add(new Gerbil());
		Iterator<Gerbil> it = gerbil.iterator();
		for (int i = 0; i < 5; i++)
			gerbil.get(i).hop();
		for (Gerbil g : gerbil)
			g.hop();
		while (it.hasNext())
			it.next().hop();
	}
}
