package chapter07;

//可以在每个类中都创建一个main()方法，这种在每个类中设置一个main()方法的技术可使每个类的单元测试都变得简便易行。
//而且在完成单元测试之后，也无需删除main()，可以将其留待下次测试
class Cleanser
{
	private String s = "Cleanser";

	public void append(String a)
	{
		s += a;
	}

	public void dilute()
	{
		append(" dilute()");
	}

	public void apply()
	{
		append(" apply()");
	}

	public void scrub()
	{
		append(" scrub()");
	}

	public String toString()
	{
		return s;
	}

	public static void main(String[] args)
	{
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}

}

public class Detergent extends Cleanser
{
	public void scrub()
	{
		append(" Detergent.scrub()");
		// 调用基类的方法
		super.scrub();
	}

	public void foam()
	{
		append(" foam()");
	}

	public static void main(String[] args)
	{
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}

class NewClass extends Detergent
{
	public void scrub()
	{
		append(" NewClass scrub()");
	}

	public void sterilize()
	{
		append(" sterilize()");
	}

	public static void main(String[] args)
	{
		NewClass n = new NewClass();
		n.scrub();
		System.out.println(n);
		n.sterilize();
		System.out.println(n);
	}
}
