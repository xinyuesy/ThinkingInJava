package chapter08;

class Instrument1
{
	void play(Note n) {  System.out.println("Instrument.play() " + n); }
	String what() { return "Instrument"; }
	void adjust() { System.out.println("Adjusting Instrument"); }
}


class Wind1 extends Instrument1
{
	void play(Note n) { System.out.println("Wind.play() " + n); }
	String what() { return "Wind"; }
	void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument1
{
	void play(Note n) { System.out.println("Percussion.play() " + n); }
	String what() { return "Percussion"; }
	void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed1 extends Instrument1
{
	void play(Note n) { System.out.println("Stringed.play() " + n); }
	String what() { return "Stringed"; }
	void adjust() { System.out.println("Adjust Stringed"); }
}

class Brass1 extends Wind1
{
	void play(Note n) { System.out.println("Brass.play() " + n); }
	void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind1
{
	void play(Note n) { System.out.println("Woodwind.play() " + n); }
	String what() { return "Woodwind"; }
}
public class Music3 
{
	public static void tune(Instrument1 i)
	{
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument1[] e)
	{
		for(Instrument1 i : e)
			tune(i);
	}
	public static void main(String[] args)
	{
		Instrument1[] orchestra = {
				new Wind1(),
				new Percussion(),
				new Stringed1(),
				new Brass1(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}
