package chapter07;

//使用final方法的原因有两个，第一个原因是把方法锁定，以防任何继承类修改它的定义，
//这是出于设计的考虑，想要确保在继承中使方法行为保持不变，并且不会被覆盖
class WithFinals
{
	private final void f()
	{
		System.out.println("WithFinals.f()");
	}

	private void g()
	{
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals
{
	public void f()
	{
		System.out.println("OverfidingPrivate.f()");
	}

	private void g()
	{
		System.out.println("OverridingPrivate.g()");
	}

	public final void f1()
	{

	}
}

class OverridingPrivate2 extends OverridingPrivate
{
	@Override
	public void f()
	{
		System.out.println("OverridingPrivate2.f()");
	}

	public void g()
	{
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion
{
	public static void main(String[] args)
	{
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
		op.f();
		WithFinals wf = op2;

	}
}
