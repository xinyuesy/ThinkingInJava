package exceptions;

public class ExceptionBouds 
{
	public static void main(String[] args)
	{
		int[] array = {1,3,6,7,8};
		System.out.println(array.length);
		int index = 10;
		while(true)
		{
			try
			{
				System.out.println(array[index]);
				break;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace(System.out);
				index--;
			}
		}
		
	}
}
