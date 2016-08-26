package interfaces;

interface Month
{
	int JANUARY = 1, FEBRUARY = 2;

}

public class Calendar implements Month
{
	// static int JANUARY = 2;
	Calendar()
	{
		// JANUARY++;
	}

	public static void main(String[] args)
	{
		// JANUARY = 3;
		System.out.println(new Calendar().JANUARY);
		System.out.println(new Calendar().JANUARY);
	}
}
