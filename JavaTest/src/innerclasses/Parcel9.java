package innerclasses;

//���������һ�������ڲ��࣬����ϣ����ʹ��һ�������ⲿ����Ķ�����ô��������Ҫ�������������final��
public class Parcel9
{
	public Destination destination(final String dest)
	{
		return new Destination()
		{
			private String label = dest;

			public String readLabel()
			{
				return label;
			}
		};
	}

	public static void main(String[] args)
	{
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}
}
