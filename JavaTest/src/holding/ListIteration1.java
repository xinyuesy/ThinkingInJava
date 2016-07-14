package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteration1 
{
	public static void main(String[] args)
	{
		List<Integer> a= new ArrayList<Integer>(Arrays.asList(1,3,5,7,9));
		List<Integer> b= new ArrayList<Integer>(5);
		ListIterator<Integer> it = a.listIterator();
		while(it.hasNext())
			System.out.println(it.nextIndex() + " " + it.next());
		it = a.listIterator(a.size());
		
		while(it.hasPrevious())
			b.add(it.previous());
		ListIterator<Integer> itb = b.listIterator();
		while(itb.hasNext())
			System.out.println(itb.next());
	}
}
