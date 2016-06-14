package interfaces.interfaceprocessor;

import java.util.Arrays;

public class SwapString implements Processor{
	public static String swap(String s)
	{
		
		String[] a = s.toString().split(" ");
		for(int i = 0; i < a.length - 1; i+=2)
		{
			String temp;
			temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		return Arrays.toString(a);
	}
	
	public static void main(String[] args)
	{
		String s = "I think I speak very poor English, but anyway I can say, this is very important";
		System.out.println(swap(s));
		SwapString swap = new SwapString();
		Apply.process(swap, s);
	}

	public String name() {
		return getClass().getSimpleName();
	}

	public Object process(Object input) {
		String[] a = input.toString().split(" ");
		for(int i = 0; i < a.length - 1; i+=2)
		{
			String temp;
			temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		return Arrays.toString(a);
	}

}
