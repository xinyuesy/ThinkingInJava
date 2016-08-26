package generics;
import typeinfo.pets.*;
public class Holder3<T>
{
	private T a;
	public Holder3(T a) { this.a = a; }
	public void set(T a ) { this.a = a; }
	public T get() { return a; }
	public static void main(String[] args)
	{
		Holder3<Automobile> h3 = 
				new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();
		//h3.set(new Integer(5));
		Holder3<Rodent> h4 = 
				new Holder3<Rodent>(new Mouse());
		System.out.println(h4.get().toString());
		Mouse m = new Mouse();
		
	}
}
