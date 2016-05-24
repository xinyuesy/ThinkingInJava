package javatest;

import java.util.*;

class Statistics
{
	public static void main(String[] args)
	{
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		for(int i = 0; i < 10000; i++)
		{
			Integer r = new Integer((int)(Math.random()*20));
			Integer temp;
			if(ht.containsKey(r))
			{
				temp = ht.get(r);
				temp++;
				ht.put(r,temp);
			}

			else
				ht.put(r,new Integer(1));
		}
		System.out.println(ht);

	}
}