package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
/*Readable�ӿ��е�read()����ʵ���˽��ַ�������charBuffer�У�����ֻ������Ҫ�����ʱ��Ż���á�
Scanner���ı�ɨ�����࣬����Scannerɨ�貢���charBuffer�е����ݵ�˳����hasNext()����Ϊ����
��һ�ε���hasNext()�����ڴ�ʱcharBuffer�������ݣ��ȴ����룬hasNext()�������������ò�ִ��read()������
ִ����read()����������read�����ķ���ֵ��ȷ���Ƿ�hasNext()�ķ���ֵ��true����false����read()����ֵ��Ϊ-1��
����ΪhasNext()Ϊtrue�����Ҽ�������read()��������read()����ֵΪ-1������ΪhasNext()Ϊfalse�����ٵ���read()������
���⣬�����ʱ�Ǹ�����һ���ո���(cb.append(" "))Ϊ׼��δ�����ո���֮ǰ�����۵��ö��ٴ�read()�����������������
ֱ��read()f��������-1���߶����ո��ǣ��ͻ����֮ǰ�ܶ��ͨ��read()�����ӵ�charBuffer���ַ�����*/
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
