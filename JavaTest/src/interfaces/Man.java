package interfaces;
import chapter08.People;
public class Man implements People{

	public void walking() {
		// TODO Auto-generated method stub
		System.out.println(this + " Walking");
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this + " eat");

	}

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(this + " sleep");

		
	}
	public static void main(String[] args)
	{
		People p = new Man();
		p.walking();
		p.eat();
		p.sleep();
	}

}
