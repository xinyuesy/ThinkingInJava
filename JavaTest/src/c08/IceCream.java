package c08;

public class IceCream
{
	static String[] flav =
	{ "Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
			"Praline Cream", "Mud Pie" };

	static String[] flavorSet(int n)
	{
		int t = Math.abs(n) % (flav.length + 1);
		String[] results = new String[t + 1];
		int[] picks = new int[t];
		int temp = 0;
		int k = 0;
		int count = 0;

		for (int i = 0; i < t; i++)
			picks[i] = -1;

		for (int j = 0; j < t;)
		{
			count++;
			temp = (int) (Math.random() * t);
			k = 0;
			for (; k < j; k++)
			{
				if (picks[k] == temp)
					break;
			}
			if (k != j)
				continue;
			else
			{
				picks[j] = temp;
				results[j] = flav[temp];
				j++;
			}

		}
		results[results.length - 1] = String.valueOf(count);
		return results;

	}

	public static void main(String[] args)
	{
		String[] results;
		for (int i = 0; i < 20; i++)
		{
			results = flavorSet(flav.length);
			System.out.println("flavorSet(" + i + ") = " + results[results.length - 1]);
			for (int j = 0; j < results.length - 1; j++)
				System.out.println("\t" + results[j]);
		}
		System.exit(0);
	}
}