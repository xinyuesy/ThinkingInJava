package chapter07;

import java.util.Random;

//����Ϊpublic,����Ա����ڰ�֮��;����Ϊstatic,��ǿ��ֻ��һ��;����Ϊfinal,��˵������һ������
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

	// ����һ�����ܸı��ֵ��ÿ��������һ����ÿ����������ֵ���ܲ�ͬ
	private final int valueOne = 9;
	// ����һ�����ܸı�ľ�ֵ̬��ÿ����ֻ��һ�������Ҳ��ܸı�
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	// ����һ�����ܸı��ֵ����һ���������ʼ����ÿ�������ֵ�᲻ͬ
	private final int i4 = rand.nextInt(20);
	// ����һ�����ܸı�ľ�ֵ̬��ÿ����ֻ��һ�������Ҳ��ܸı�
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	// ����һ�����ܸı�Ķ���ÿ��������һ���������������ֵ���Ըı�
	private final Value v2 = new Value(22);
	// ����һ�����ܸı�ľ�̬����ÿ����ֻ��һ�������������ֵ���Ըı�
	private static final Value VAL_3 = new Value(33);
	// ����һ�����ܸı�����飬���鲻�ܸı䣬���������ֵ���Ըı�
	private final int[] a =
	{ 1, 2, 3, 4, 5, 6 };

	public String toString()
	{
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}

	public static void main(String[] args)
	{
		FinalData fd1 = new FinalData("fd1");
		// final���������ֵ���Ըı�
		fd1.v2.i++;
		System.out.println("fd1.v2: " + fd1.v2);
		fd1.v1 = new Value(9);
		// final���������ֵ���Ըı�
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++;
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
		int[] b =
		{ 4, 5, 6 };
		// final��ֵ���ܱ��ı�
		// fd1.a = b;
		// fd1.valueOne = 10;
		System.out.println("fd2.v2: " + fd2.v2);
		System.out.println("fd1.VAL_3: " + fd1.VAL_3);
		System.out.println("fd2.VAL_3: " + fd2.VAL_3);
	}
}
