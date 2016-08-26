package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class MyCollection
{
	static void print(Collection<String> c)
	{
		Iterator it = c.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();

	}

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>(
				Arrays.asList("Tomato", "Apple", "Peach", "Banana", "Grape", "Watermelon", "Durian"));
		LinkedList<String> b = new LinkedList<String>(a);
		HashSet<String> c = new HashSet<String>(a);
		TreeSet<String> d = new TreeSet<String>(a);

		List<String> e = Arrays.asList("Tomato", "Apple", "Peach", "Banana", "Grape", "Watermelon", "Durian");

		print(a);
		print(b);
		print(c);
		print(d);
		print(e);

	}
}
