package interfaces;


interface Screen
{
	void display();
	void touch();
}

interface Microphone
{
	void play();
	void record();
	//void display();
}

interface Camera
{
	void capture();
	void view();
}

interface BasicPhone extends Screen, Microphone, Camera
{
	void call();
}
abstract class PhoneCover
{
	abstract void protectDisplay();
}
class Phone extends PhoneCover
{
	void wifi() { System.out.println("wifi()"); }

	@Override
	void protectDisplay() {
		System.out.println("ProtectDisplay()");		
	}
}

public class PhoneTest extends Phone implements BasicPhone
{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display()");
	}

	public void touch() {
		// TODO Auto-generated method stub
		System.out.println("Touch()");
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play()");
	}

	public void record() {
		// TODO Auto-generated method stub
		System.out.println("Record()");
	}

	public void capture() {
		// TODO Auto-generated method stub
		System.out.println("Capture()");
	}

	public void view() {
		// TODO Auto-generated method stub
		System.out.println("View()");
	}

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call()");
	}
	static void u(Camera x)
	{
		x.capture();
		x.view();
	}
	static void v(Microphone x)
	{
		x.record();
		x.play();
	}
	static void w(Phone x)
	{
		x.wifi();
		x.protectDisplay();
	}
	
	static void x(Screen x)
	{
		x.display();
		x.touch();
	}
	
	static void y(BasicPhone x)
	{
		x.call();
	}
	public static void main(String[] args)
	{
		PhoneTest p = new PhoneTest();
		u(p);
		v(p);
		w(p);
		x(p);
		y(p);
	}

}
