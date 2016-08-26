package interfaces;

//9.2½Ó¿Ú 20160613 14:12 P205

/*interface Instrument1
{
	int VALUE = 5;
	void play(Note n);
	void adjust();
}

class Wind1 implements Instrument1
{
	public void play(Note n)
	{
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Wind"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}
class Percussion1 implements Instrument1
{
	public void play(Note n)
	{
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Percussion"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed1 implements Instrument1
{
	public void play(Note n)
	{
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Stringed"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass1 extends Wind1
{
	public String toString() { return "Brass"; }
}

class Woodwind1 extends Wind1
{
	public String toString() { return "Woodwind"; }
}
public class Music5 {
	
	static void tune(Instrument1 i)
	{
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument1[] e)
	{
		for(Instrument1 i : e)
			tune(i);
	}
	public static void main(String[] args)
	{
		Instrument1[] orchestra = {
				new Wind1(),
				new Percussion1(),
				new Stringed1(),
				new Brass1(),
				new Woodwind1()
		};
		tuneAll(orchestra);
	}

}*/

interface Instrument1
{
	int VALUE = 5;

	void adjust();
}

interface Playable
{
	void play(Note n);
}

class Wind1 implements Instrument1, Playable
{
	public void play(Note n)
	{
		System.out.println(this + ".play() " + n);
	}

	public String toString()
	{
		return "Wind";
	}

	public void adjust()
	{
		System.out.println(this + ".adjust()");
	}
}

class Percussion1 implements Instrument1, Playable
{
	public void play(Note n)
	{
		System.out.println(this + ".play() " + n);
	}

	public String toString()
	{
		return "Percussion";
	}

	public void adjust()
	{
		System.out.println(this + ".adjust()");
	}
}

class Stringed1 implements Instrument1, Playable
{
	public void play(Note n)
	{
		System.out.println(this + ".play() " + n);
	}

	public String toString()
	{
		return "Stringed";
	}

	public void adjust()
	{
		System.out.println(this + ".adjust()");
	}
}

class Brass1 extends Wind1
{
	public String toString()
	{
		return "Brass";
	}
}

class Woodwind1 extends Wind1
{
	public String toString()
	{
		return "Woodwind";
	}
}

public class Music5
{

	static void tune(Playable i)
	{
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e)
	{
		for (Playable i : e)
			tune(i);
	}

	public static void main(String[] args)
	{
		Playable[] orchestra =
		{ new Wind1(), new Percussion1(), new Stringed1(), new Brass1(), new Woodwind1() };
		tuneAll(orchestra);
	}

}
