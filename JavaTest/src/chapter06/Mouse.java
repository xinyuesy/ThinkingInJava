package chapter06;

public class Mouse {
	int mouseNumber;
	
	public Mouse(int number)
	{
		mouseNumber = number;
	}
	
	public int getNumber()
	{
		return mouseNumber;
	}
	public static void main(String[] args)
	{
		ChocolateChip c = new ChocolateChip();
		c.makeCookie();
		//private �Ĳ��ܷ���
		//c.testPrivate();
		//��ͬһ����������а�����Ȩ�޵Ŀ��Է���
		c.testPackage();
		//Protected �ڼ̳�����Է���
		c.testProtected();
		//public�����Է���
		c.testPublic();
		Cookie cookie = new Cookie();
		//protected��ͬһ�����ڿ��Է���
		c.testProtected();
	}

}
