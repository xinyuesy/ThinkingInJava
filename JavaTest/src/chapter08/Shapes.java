package chapter08;

import java.util.Random;

//动态绑定/后期绑定
class Shape
{
	public void draw()
	{
	}

	public void erase()
	{
	}

	public void print()
	{
		System.out.println("Shape.print()");
	}
}

class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Circle.draw()");
	}

	@Override
	public void erase()
	{
		System.out.println("Circle.erase()");
	}

	@Override
	public void print()
	{
		System.out.println("Circle.print()");
	}
}

class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Square.draw()");
	}

	@Override
	public void erase()
	{
		System.out.println("Square.erase()");
	}

	@Override
	public void print()
	{
		System.out.println("Square.print()");
	}
}

class Triangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Triangle.draw()");
	}

	@Override
	public void erase()
	{
		System.out.println("Triangle.erase()");
	}

	@Override
	public void print()
	{
		System.out.println("Triangle.print()");
	}
}

class Rectangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Rectangle.draw()");
	}

	@Override
	public void erase()
	{
		System.out.println("Rectangle.erase()");
	}

	@Override
	public void print()
	{
		System.out.println("Rectangle.print()");
	}
}

class RandomShapeGenerator
{
	private Random rand = new Random(System.currentTimeMillis());

	public Shape next()
	{
		switch (rand.nextInt(4))
		{
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Rectangle();

		}
	}
}

public class Shapes
{
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	private static Random rand = new Random(System.currentTimeMillis());

	public static void main(String[] args)
	{
		Shape[] s = new Shape[9];
		for (int i = 0; i < 10; i++)
		{
			System.out.print(rand.nextInt(10) + "  ");
		}
		System.out.println();
		for (int i = 0; i < s.length; i++)
		{
			s[i] = gen.next();
		}
		for (Shape shp : s)
		{
			shp.draw();
			shp.print();
		}
	}

}
