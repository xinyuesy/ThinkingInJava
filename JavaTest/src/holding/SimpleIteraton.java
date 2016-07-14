package holding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import typeinfo.pets.*;

public class SimpleIteraton 
{
	public static void main(String[] args)
	{
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext())
		{
			Pet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for(Pet p : pets)
			System.out.print(p.id() + ":" + p + " ");
		System.out.println();
		it = pets.iterator();
		for(int i = 0; i < 6; i++)
		{
			it.next();
			it.remove();
		}
		System.out.println(pets);
		
		List a = new ArrayList(Arrays.asList(4,5,8,9));
		Iterator ite = a.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
	}
}
