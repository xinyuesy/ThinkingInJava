package chapter07;

class Animal
{
	private int age;
	Animal(int age)
	{
		this.age = age;
	}
	int getAge()
	{
		return age;
	}

}

public class Mouse extends Animal
{
	Mouse()
	{
		super(5);
		System.out.println("This is mouse without argument constructor " + this.getAge());
	}
	Mouse(int age)
	{
		super(age);
		System.out.println("This is mouse with argument constructor "  + this.getAge());
	}
	public static void main(String[] args)
	{
		Mouse m = new Mouse(7);
	}
}
