package innerclasses;

public interface ClassInInterface 
{
	void howdy();
	static int a = 5;
	class Test
	{
		static void print(ClassInInterface c)
		{
			System.out.println(c.a);
			howdy();
		}
		public static void howdy()
		{
			System.out.println("Howdy!");
		}
		
		public static void main(String[] args)
		{
			new Test().howdy();
		}
	}
}
