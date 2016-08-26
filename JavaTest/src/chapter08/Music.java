package chapter08;

public class Music
{
	public static void tune(Instrument i)
	{
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args)
	{
		Wind flute = new Wind();
		tune(flute);
		Brass b = new Brass();
		tune(b);
	}

}
