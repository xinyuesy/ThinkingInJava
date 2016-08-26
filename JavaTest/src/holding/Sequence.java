package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Sequence extends ArrayList
{
	public Sequence(Collection c)
	{
		super(c);
	}

	public static void main(String[] args)
	{
		Sequence s = new Sequence(Arrays.asList(3, 5, 7, 9));
		Iterator it = s.iterator();
		ArrayList a = new ArrayList(Arrays.asList(3, 5, 7, 9));
		while (it.hasNext())
			System.out.println(it.next());
	}
}
