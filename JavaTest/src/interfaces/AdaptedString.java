package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdaptedString implements Readable
{
	private int count = 10;
	private String s = "Char buffers can be created either by allocation, "
			+ "which allocates space for the buffer's content, by wrapping an "
			+ "existing char array or string into a buffer, or by creating a view of an existing byte buffer.";
	private String[] a = s.split(" ");
	private Random rand = new Random(System.currentTimeMillis());
	
	public String randomString()
	{
		
		return a[rand.nextInt(a.length)];
	}
	public int read(CharBuffer cb)
	{
		if(count--==0)
			return -1;
		cb.append(randomString());
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args)
	{
		//String s = "Char buffers can be created either by allocation, "
		//		+ "which allocates space for the buffer's content, by wrapping an "
		//		+ "existing char array or string into a buffer, or by creating a view of an existing byte buffer.";
		//System.out.println(s.toCharArray());
		//System.out.println(Arrays.toString(s.split(" ")));
		//String[] a = s.split(" ");
		//for(int i = 0; i < a.length; i++)
			//System.out.println(a[i]);
		Scanner s = new Scanner(new AdaptedString());
		while(s.hasNext())
			System.out.println(s.next());
		
	}
}
