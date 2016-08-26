package innerclasses;

interface U
{
	void a();

	void b();

	void c();
}

class A
{
	U d()
	{
		return new U()
		{
			public void a()
			{
				System.out.println("U.a()");
			}

			public void b()
			{
				System.out.println("U.b()");
			}

			public void c()
			{
				System.out.println("U.c()");
			}

			public String toString()
			{
				return "A.d()";
			}

		};
	}

}

class B
{
	private U[] uarray = new U[10];
	private int i = 0;

	void save(U u)
	{
		uarray[i++] = u;
	}

	void reset()
	{
		uarray = null;
	}

	void remove(int i)
	{
		if (i < uarray.length && i >= 0 && uarray[i - 1] != null)
		{
			System.out.println("Remove " + i + uarray[i - 1]);
			;
			uarray[i - 1] = null;

		}
	}

	U getValue(int i)
	{
		return uarray[i - 1];
	}

	void print()
	{
		for (int i = 0; i < uarray.length && uarray[i] != null; i++)
			System.out.println(i + " " + uarray[i]);
	}
}

public class Test23
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		B b = new B();
		b.save(a1.d());
		b.save(a2.d());
		b.save(a3.d());
		b.save(a4.d());
		b.save(a5.d());
		b.print();
		b.getValue(3).a();
		b.remove(3);

	}
}
