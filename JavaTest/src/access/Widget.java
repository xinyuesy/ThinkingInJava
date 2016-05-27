package access;

public class Widget {
	private Tools t;
	public Widget()
	{
		t = new Tools();
		System.out.println("Widget is constructed");
	}
	
	public int add(int a, int b)
	{
		System.out.println("Widget add method is called");
		System.out.println();
		return t.add(a, b);
	}

	
}


class Tools {
	Tools()
	{
		System.out.println("Tools is constructed");
	}
	
	int add(int a, int b)
	{
		System.out.println("Tools add method is called");
		return a+b;
	}
}