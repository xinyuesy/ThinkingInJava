package testpackage;

//import chapter06.Mouse;
import access.Widget;

//import access.Tools;
//��ֻ��public����Ȩ�޺�package����Ȩ��
public class Mouse
{
	int mouseNumber;

	Mouse(int number)
	{
		mouseNumber = number;
	}

	// System.out.println(m.getNumber());
	public static void main(String[] args)
	{
		chapter06.Mouse m = new chapter06.Mouse(5);
		System.out.println(m.getNumber());
		Widget w = new Widget();
		System.out.println("5 + 6 = " + w.add(5, 6));

	}
}
