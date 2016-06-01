package chapter07;

class SmallBrain{}
//当将某个类的整体定义为final时，就表明了你不打算继承该类，而且也不允许别人这么做
final class Dinosaur
{
	int  i = 7;
	int  j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}
public class Jurassic 
{
	public static void main(String[] args)
	{
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}
