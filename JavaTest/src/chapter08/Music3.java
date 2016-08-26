package chapter08;

import java.util.Random;

class Instrument1
{
	void play(Note n)
	{
		System.out.println("Instrument.play() " + n);
	}

	String what()
	{
		return "Instrument";
	}

	void adjust()
	{
		System.out.println("Adjusting Instrument");
	}

	public String toString()
	{
		return "Instrument";
	}
}

class Wind1 extends Instrument1
{
	void play(Note n)
	{
		System.out.println("Wind.play() " + n);
	}

	String what()
	{
		return "Wind";
	}

	void adjust()
	{
		System.out.println("Adjusting Wind");
	}

	public String toString()
	{
		return "Wind";
	}
}

class Percussion extends Instrument1
{
	void play(Note n)
	{
		System.out.println("Percussion.play() " + n);
	}

	String what()
	{
		return "Percussion";
	}

	void adjust()
	{
		System.out.println("Adjusting Percussion");
	}

	public String toString()
	{
		return "Percussion";
	}
}

class Stringed1 extends Instrument1
{
	void play(Note n)
	{
		System.out.println("Stringed.play() " + n);
	}

	String what()
	{
		return "Stringed";
	}

	void adjust()
	{
		System.out.println("Adjust Stringed");
	}

	public String toString()
	{
		return "Stringed";
	}
}

class Brass1 extends Wind1
{
	void play(Note n)
	{
		System.out.println("Brass.play() " + n);
	}

	void adjust()
	{
		System.out.println("Adjusting Brass");
	}

	public String toString()
	{
		return "Brass";
	}
}

class Woodwind extends Wind1
{
	void play(Note n)
	{
		System.out.println("Woodwind.play() " + n);
	}

	String what()
	{
		return "Woodwind";
	}

	public String toString()
	{
		return "Woodwind";
	}
}

class Generator
{
	private static Random rand = new Random(System.currentTimeMillis());

	public static Instrument1 next()
	{
		switch (rand.nextInt(5))
		{
		default:
		case 0:
			return new Wind1();
		case 1:
			return new Brass1();
		case 2:
			return new Percussion();
		case 3:
			return new Stringed1();
		case 4:
			return new Woodwind();

		}
	}
}

public class Music3
{
	public static void tune(Instrument1 i)
	{
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument1[] e)
	{
		for (Instrument1 i : e)
		{
			tune(i);
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		Instrument1[] orchestra =
		{ new Wind1(), new Percussion(), new Stringed1(), new Brass1(), new Woodwind() };
		for (int i = 0; i < 50; i++)
			tune(Generator.next());
		// tuneAll(orchestra);
	}
}
