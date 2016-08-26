package chapter08;

//编写构造器时有一条有效的准则:“用尽可能简单的方法使对象进入正常状态；如果可以的话，避免调用其他方法”。
//在构造器内唯一能够调用的那些方法是基类中的final方法（也使用于平private方法，它们自动属于final方法）
class Glyph
{
	void draw()
	{
		System.out.println("Glypy.draw()");
	}

	Glyph()
	{
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph
{
	private int radius = 1;

	RoundGlyph(int r)
	{
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw()
	{
		System.out.println("RoundGlyph.draw, radius = " + radius);
	}
}

class RectangularGlyph extends Glyph
{
	RectangularGlyph()
	{
		System.out.println("RectangularGlyph()");
	}

	void draw()
	{
		System.out.println("RectangularGlyph.draw()");
	}
}

public class PolyConstructors
{
	public static void main(String[] args)
	{
		new RoundGlyph(5);
		new RectangularGlyph();
	}

}
