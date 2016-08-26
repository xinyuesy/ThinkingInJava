package chapter08;

//��д������ʱ��һ����Ч��׼��:���þ����ܼ򵥵ķ���ʹ�����������״̬��������ԵĻ����������������������
//�ڹ�������Ψһ�ܹ����õ���Щ�����ǻ����е�final������Ҳʹ����ƽprivate�����������Զ�����final������
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
