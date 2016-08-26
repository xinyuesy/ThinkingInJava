package innerclasses;

public class DotThis
{
	void f()
	{
		System.out.println("DotThis.f()");
	}

	public class Inner
	{
		public DotThis outer()
		{
			return DotThis.this;
		}
	}

	public Inner inner()
	{
		return new Inner();
	}

	public static void main(String[] args)
	{
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		DotThis.Inner dti1 = dt.new Inner();
		dti1.outer().f();
		dti.outer().f();
	}
}
