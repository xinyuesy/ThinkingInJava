package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
/*Readable接口中的read()方法实现了将字符串读入charBuffer中，但是只有在需要输出的时候才会调用。
Scanner是文本扫描器类，利用Scanner扫描并输出charBuffer中的内容的顺序：以hasNext()方法为例：
第一次调用hasNext()，由于此时charBuffer并无内容，等待输入，hasNext()方法阻塞，调用并执行read()方法，
执行完read()方法，根据read方法的返回值来确定是否hasNext()的返回值是true或者false：若read()返回值不为-1，
则认为hasNext()为true，并且继续调用read()方法；若read()返回值为-1，则认为hasNext()为false，不再调用read()方法。
另外，在输出时是根据下一个空格标记(cb.append(" "))为准，未读到空格标记之前，无论调用多少次read()方法，都不会输出，
直到read()f方法返回-1或者读到空格标记，就会输出之前很多次通过read()方法加到charBuffer的字符串。*/
public class RandomWords implements Readable
{
	private static Random rand = new Random(47);
	private static final char[] capitals = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers =
			"abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels =
			"aeiou".toCharArray();
	private int count;
	public RandomWords(int count) { this.count = count; }
	public int read(CharBuffer cb)
	{
		if(count-- == 0)
			return -1;
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i = 0; i < 4; i++)
		{
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(new RandomWords(10));
		while(s.hasNext())
			System.out.println(s.next());
	}
}
