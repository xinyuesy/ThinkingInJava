package chapter07;

class Instrument
{

	public void play()
	{
		System.out.println("Play the instrument");
	}
	static void tune(Instrument i)
	{
		i.play();
	}
}
public class Wind extends Instrument
{
	public static void main(String[] args)
	{
		Wind w = new Wind();
		w.tune(w);
		Instrument.tune(w);
	}
}
