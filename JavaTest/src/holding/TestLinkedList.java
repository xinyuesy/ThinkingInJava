package holding;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class TestLinkedList
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> it = list.listIterator();
		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < 10; i++)
		{
			it = list.listIterator(list.size() / 2);
			it.add(rand.nextInt(100));
			System.out.println(list);
		}
		it = list.listIterator(0);
		while (it.hasNext())
			System.out.print(it.next() + " ");
	}
}
