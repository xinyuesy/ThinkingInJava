package access;


//不能跨包访问非公有类
public class PackagedClass {
	public PackagedClass()
	{
		System.out.println("Creating a packaged class");
	}

}
