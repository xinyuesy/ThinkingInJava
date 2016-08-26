package chapter07;

import java.util.Random;

//定义为public,则可以被用于包之外;定义为static,则强调只有一份;定义为final,则说明它是一个常量
class Value
{
	int i;

	public Value(int i)
	{
		this.i = i;
	}

}

public class FinalData
{

	private static Random rand = new Random(47);
	private String id;

	public FinalData(String id)
	{
		this.id = id;
	}

	// 定义一个不能改变的值，每个对象有一个，每个对象的这个值可能不同
	private final int valueOne = 9;
	// 定义一个不能改变的静态值，每个类只有一个，并且不能改变
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	// 定义一个不能改变的值并用一个随机数初始化，每个对象的值会不同
	private final int i4 = rand.nextInt(20);
	// 定义一个不能改变的静态值，每个类只有一个，并且不能改变
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	// 定义一个不能改变的对象，每个对象都有一个，但对象里面的值可以改变
	private final Value v2 = new Value(22);
	// 定义一个不能改变的静态对象，每个类只有一个，对象里面的值可以改变
	private static final Value VAL_3 = new Value(33);
	// 定义一个不能改变的数组，数组不能改变，但是里面的值可以改变
	private final int[] a =
	{ 1, 2, 3, 4, 5, 6 };

	public String toString()
	{
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}

	public static void main(String[] args)
	{
		FinalData fd1 = new FinalData("fd1");
		// final对象里面的值可以改变
		fd1.v2.i++;
		System.out.println("fd1.v2: " + fd1.v2);
		fd1.v1 = new Value(9);
		// final数组里面的值可以改变
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++;
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
		int[] b =
		{ 4, 5, 6 };
		// final的值不能被改变
		// fd1.a = b;
		// fd1.valueOne = 10;
		System.out.println("fd2.v2: " + fd2.v2);
		System.out.println("fd1.VAL_3: " + fd1.VAL_3);
		System.out.println("fd2.VAL_3: " + fd2.VAL_3);
	}
}
