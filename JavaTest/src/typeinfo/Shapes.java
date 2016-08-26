package typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape
{
	void draw()
	{
		System.out.println(this + ".draw()");
	}

	abstract public String toString();

	void rotate()
	{
		if (!(this instanceof Circle))
		{
			System.out.println("Rotate the: " + this);
		} else
		{
			System.out.println("Not rotate the: " + this);
		}
	}
}

class Circle extends Shape
{
	public String toString()
	{
		return "Circle";
	}
}

class Square extends Shape
{
	public String toString()
	{
		return "Square";
	}
}

class Triangle extends Shape
{
	public String toString()
	{
		return "Triangle";
	}
}

class Rhomboid extends Shape
{
	public String toString()
	{
		return "Rhomboid";
	}
}

public class Shapes
{
	public static void main(String[] args)
	{
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		Character c = new Character('A');
		char[] c1 =
		{ 'B', 'A', 'c', 'd', c };
		char c2 = c;
		// System.out.println(c2 instanceof Character);
		for (Shape shape : shapeList)
		{
			shape.draw();
			shape.rotate();
		}
		Shape s = new Circle();
		s.draw();
		System.out.println("s is instance of Circle: " + (s instanceof Circle));
		System.out.println("s is instance of Rhomboid: " + (s instanceof Rhomboid));
		s = new Rhomboid();
		s.draw();
		// boolean res = s instanceof Shape;
		System.out.println("s is instance of Shape: " + (s instanceof Shape));
		System.out.println("s is instance of Rhomboid: " + (s instanceof Rhomboid));
		System.out.println("s is instance of Circle: " + (s instanceof Circle));

	}
}
