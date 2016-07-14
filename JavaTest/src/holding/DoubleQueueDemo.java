package holding;

import java.text.DecimalFormat;
import java.util.PriorityQueue;
import java.util.Random;

public class DoubleQueueDemo 
{
	public static void main(String[] args)
	{
		Random rand = new Random(47);
		//rand.nextDouble()
		PriorityQueue<Double> doubleque = new PriorityQueue<Double>();
		DecimalFormat df = new DecimalFormat("#.00");
		for(int i = 0; i < 10; i++)
		{
			doubleque.offer(rand.nextDouble()*100);
		}
		while(doubleque.peek()!=null)
		{
			System.out.print(df.format(doubleque.poll()) + "  ");
		}
		
		System.out.println();
	}
}
