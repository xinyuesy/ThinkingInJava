package c08;

import java.util.ArrayList;
import java.util.Iterator;

public class Test
{
	public static void main(String[] args)
	{
		short s1 = 1;
		s1 += 1;
		s1 = (short) (s1 + 1);
		System.out.println(s1);
		float f = 3.14f;
		Short s2 = new Short("12");
		System.out.println(s2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
		{
			list.add(new Integer((int) (Math.random() * 100)));
		}

		Iterator<Integer> i = list.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

}
