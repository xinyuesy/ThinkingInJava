package chapter07;

public class Porsche extends SportsCar
{
	Porsche(int height)
	{
		super(height);
		System.out.println("Porsche is constructed");
		// TODO Auto-generated constructor stub
	}

	private MiniVan paris;
	// Porsche() { System.out.println("Porsche is constructed"); }

	public static void main(String[] args)
	{
		// paris = new MiniVan();
		Porsche p = new Porsche(1);
		p.paris = new MiniVan(2);

	}

}
