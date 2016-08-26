package chapter07;

class Homer
{
	char doh(char c)
	{
		System.out.println("doh(char)");
		return 'd';
	}

	void doh(Milhouse m)
	{
		// TODO Auto-generated method stub
		System.out.println("Homer doh(Milhouse)");

	}

	float doh(float f)
	{
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse
{
}

class Bart extends Homer
{
	@Override
	void doh(Milhouse m)
	{
		System.out.println("doh(Milhouse)");
	}
}

public class Hide extends Bart
{
	public static void main(String[] args)
	{
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
		// b.doh(m);

		Hide h = new Hide();
		h.doh(1);
		h.doh(1.0f);
		h.doh('c');
		h.doh(new Milhouse());
	}
}
