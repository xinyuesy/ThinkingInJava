package typeinfo.toys;

interface HasBatteries
{
}

interface Waterproof
{
}

interface Shoots
{
}

interface Test
{
}

class Toy
{
	Toy()
	{
	}

	Toy(int i)
	{
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Test
{
	FancyToy()
	{
		super(1);
	}
}

public class ToyTest
{
	static void printInfo(Class cc)
	{
		System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name : " + cc.getCanonicalName());
	}

	static void print(Class cc)
	{
		System.out.println("SuperClass: " + cc.getSuperclass());
		System.out.println("ClassDetail: " + cc.getDeclaredFields());
	}

	public static void main(String[] args)
	{
		Class c = null;
		try
		{
			c = Class.forName("typeinfo.toys.FancyToy");
		} catch (ClassNotFoundException e)
		{
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try
		{
			obj = up.newInstance();
		} catch (InstantiationException e)
		{
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e)
		{
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
		System.out.println(FancyToy.class.getSuperclass());
		print(up);
	}
}
