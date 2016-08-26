package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger
{
	public static void main(String[] args)
	{
		Random rand = new Random(System.currentTimeMillis());
		Set<Integer> intset = new HashSet<Integer>();
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(4, 6, 7, 2, 9, 10));
		ArrayList<Integer> intarray = new ArrayList<Integer>();
		Integer temp;
		for (int i = 0; i < 20; i++)
		{
			temp = rand.nextInt(30);
			intarray.add(temp);
			intset.add(temp);
		}
		System.out.println(intarray);
		System.out.println(intset);
		System.out.println(set);

	}
}
