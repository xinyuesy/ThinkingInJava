package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import typeinfo.pets.*;

public class ListFeatures2 
{
	public static void main(String[] args)
	{
		Random rand = new Random(47);
		List<Integer> pets = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("1. " + pets);
		//Hamster h = new Hamster();
		pets.add(7);
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains(6));
		//pets.remove(6);
		Integer p = pets.get(2);
		System.out.println("4: " + p + " " + pets.indexOf(p));
		Integer cymric = new Integer(4);
		System.out.println("5: " + pets.indexOf(cymric));
		System.out.println("6: " + pets.remove(cymric));
		System.out.println("7: " + pets.remove(p));
		System.out.println("8: " + pets);
		pets.add(3, 21);
		System.out.println("9: " + pets);
		List<Integer> sub = pets.subList(1,4);
		System.out.println("sublist: " + sub);
		System.out.println("10: " + pets.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted subList: " + sub);
		System.out.println("11: " + pets.containsAll(sub));
		Collections.shuffle(sub,rand);
		System.out.println("shuffled sublist: " + sub);
		System.out.println("12: " + pets.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(pets);
		sub = Arrays.asList(pets.get(1),pets.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(pets);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(1, 14);
		System.out.println("16: " + copy);
		copy.addAll(2,sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + pets.isEmpty());
		pets.clear();
		System.out.println("19: " + pets);
		System.out.println("20: " + pets.isEmpty());
		pets.addAll(Arrays.asList(4,6,8,9));
		System.out.println("21: " + pets);
		Object[] o = pets.toArray();
		System.out.println("22: " + o[3]);
		//Pet[] pa = pets.toArray(new Pet[0]);
		//System.out.println("23: " + pa[3].id());
	}
}

