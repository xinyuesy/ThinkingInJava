package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//import typeinfo.flowers.*;

class Flower implements Comparable<Flower>
{
	private String name;
	Flower(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
	public String getString()
	{
		return name;
	}

	public int compareTo(Flower o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getString());
	}
}


public class ListFeatures3 
{
	public static void main(String[] args)
	{
		Random rand = new Random(47);
		List<Flower> flowers = new ArrayList<Flower>(Arrays.asList(new Flower("Rose"),new Flower("Tulip"),new Flower("Lotus")));
	
		System.out.println("1. " + flowers);
		//Hamster h = new Hamster();
		Flower f = new Flower("Sakura");
		flowers.add(f);
		System.out.println("2: " + flowers);
		System.out.println("3: " + flowers.contains(f));
		flowers.remove(f);
		Flower p = flowers.get(2);
		System.out.println("4: " + p + " " + flowers.indexOf(p));
		Flower lavander = new Flower("Lavander");
		System.out.println("5: " + flowers.indexOf(lavander));
		System.out.println("6: " + flowers.remove(lavander));
		System.out.println("7: " + flowers.remove(p));
		System.out.println("8: " + flowers);
		flowers.add(1, new Flower("Wintersweet"));
		System.out.println("9: " + flowers);
		List<Flower> sub = flowers.subList(1,2);
		System.out.println("sublist: " + sub);
		System.out.println("10: " + flowers.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted subList: " + sub);
		System.out.println("11: " + flowers.containsAll(sub));
		Collections.shuffle(sub,rand);
		System.out.println("shuffled sublist: " + sub);
		System.out.println("12: " + flowers.containsAll(sub));
		List<Flower> copy = new ArrayList<Flower>(flowers);
		sub = Arrays.asList(flowers.get(1),flowers.get(2));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Flower>(flowers);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(0, new Flower("Rose"));
		System.out.println("16: " + copy);
		copy.addAll(0,sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + flowers.isEmpty());
		flowers.clear();
		System.out.println("19: " + flowers);
		System.out.println("20: " + flowers.isEmpty());
		flowers.addAll(Arrays.asList(new Flower("Rose"),new Flower("Lotus")));
		System.out.println("21: " + flowers);
		Object[] o = flowers.toArray();
		System.out.println("22: " + o[1]);
		//Pet[] pa = flowers.toArray(new Pet[0]);
		//System.out.println("23: " + pa[3].id());
	}
}

