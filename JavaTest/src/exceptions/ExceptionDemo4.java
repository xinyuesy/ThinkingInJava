package exceptions;

import java.util.Random;

public class ExceptionDemo4 
{
	public static void main(String[] args)
	{
		int[] array = new int[5];
		
		Random rand = new Random(System.currentTimeMillis());
		for(int i = 0; i < array.length; i++)
			array[i] = rand.nextInt(100);
		int index = rand.nextInt(20);
		for(int i = 0; i < 10; i++)
		{
			if(index>4 || index < 0 )
				throw new ArrayIndexOutOfBoundsException();
			else
				System.out.println(array[index]);
		}
			
	}
}
