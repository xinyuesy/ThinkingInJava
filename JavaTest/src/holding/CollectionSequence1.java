package holding;

import java.util.Collection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionSequence1 implements Collection
{
	private Pet[] pets = Pets.createArray(8);
	public static void main(String[] args)
	{
		CollectionSequence1 s = new CollectionSequence1();
		InterfaceVsIterator.display(s);
		Iterator<Pet> it = s.iterator();
		while(it.hasNext())
		{
			Pet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for(Pet p : s.pets)
			System.out.print(p.id() + ":" + p + " ");
	}

	public int size() {
		return pets.length;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (pets.length==0);
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		for(Pet p : pets)
		{
			if(p.equals(o))
				return true;
		}
		return false;
	}

	public Iterator iterator() {
		return new Iterator<Pet>()
				{
				
					private int index = 0;
					public boolean hasNext() {
						return index<pets.length;
					}

					public Pet next() {
						return pets[index++];
					}
					
				};
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
}
