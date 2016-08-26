package generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T,V>
{
	private static class TwoItem<T,V>
	{
		private T t;
		private V v;
		TwoItem(T t, V v)
		{
			this.t = t;
			this.v = v;
		}
		public String toString()
		{
			return t.toString() + " " +  v.toString();
		}
	}
	private ArrayList<TwoItem> storage = new ArrayList<TwoItem>();
	//private ArrayList<V> storage1 = new ArrayList<V>();
	private Random rand = new Random(47);
	public void add(TwoItem t) 
	{ 
		storage.add(t);
	}
	public TwoItem get(int index)
	{
		return storage.get(index);
	}
	public TwoItem select()
	{
		return storage.get(rand.nextInt(storage.size()));
	}
	
	public static void main(String[] args)
	{
		RandomList<String,Integer> rs = new RandomList<String,Integer>();
		Random rand = new Random(System.currentTimeMillis());
		for(String s: ("The quick brown fox jumped over " + 
						"the lazy brown dog").split(" "))
			rs.add(new TwoItem(s,new Integer(rand.nextInt(100))));
		for(int i = 0; i < 11; i++)
			System.out.println(rs.select());
	}
}
