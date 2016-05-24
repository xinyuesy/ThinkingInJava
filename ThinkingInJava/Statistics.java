import java.util.*;

class Stattistics
{
	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable();
		for(int i = 0; i < 10000; i++)
		{
			Integer r = new Integer((int)(Math.random()*20));
			if(ht.containsKey(r))
				ht.get(r)++;
			else
				ht.put(r,new Integer(1));
		}
		System.out.println(ht);

	}
}