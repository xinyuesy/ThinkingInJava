package chapter07;

//ʹ��final������ԭ������������һ��ԭ���ǰѷ����������Է��κμ̳����޸����Ķ��壬
//���ǳ�����ƵĿ��ǣ���Ҫȷ���ڼ̳���ʹ������Ϊ���ֲ��䣬���Ҳ��ᱻ����
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
