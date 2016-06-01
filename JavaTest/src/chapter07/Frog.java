package chapter07;


class Amphibian
{
	Amphibian()
	{
		System.out.println("Amphibian constructed");
	}
	static void test(Amphibian a)
	{
		System.out.println("Amphibian static method is called");
	}
	void swimming()
	{
		System.out.println("Amphibian Swimming");
	}
}
public class Frog extends Amphibian
{
	void jump()
	{
		System.out.println("Jump");
	}
	
	void swimming()
	{
		System.out.println("Frog swimming");
	}
	public static void main(String[] args)
	{
		Frog f = new Frog();
		Amphibian.test(f);
		f.jump();
		f.swimming();
		Amphibian a = new Frog();
		a.swimming();
		//a.test(a);
	}
}

class Pig
{
	Pig()
	{
		Amphibian a = new Amphibian();
		a.swimming();
		
	}
}
