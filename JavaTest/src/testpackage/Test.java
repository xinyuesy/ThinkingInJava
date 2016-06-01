package testpackage;
import access.PackagedClass;
import chapter07.Orc;
//import chapter07.Orc;
//类只有public访问权限和package访问权限
public class Test {
	
	private static Mouse[] test = new Mouse[10];
	public static void main(String[] args)
	{
		
		//不能跨包访问非公有类
		PackagedClass pc = new PackagedClass();
		Integer[] number = new Integer[10];
		for(int i = 0; i < 10; i++)
		{
			number[i] = (int) (Math.random()*100);
		}
		
		for(int i = 0; i < 10; i++)
			System.out.println(number[i]);
		
		Orc o = new Orc("Sam",25);
		
		
		
	}

}
