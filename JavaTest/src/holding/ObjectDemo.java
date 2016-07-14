package holding;

import java.util.PriorityQueue;

class TestObject{}
public class ObjectDemo 
{
	public static void main(String[] args)
	{
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.offer(new TestObject());
		pq.offer(new TestObject());
		while(pq.peek()!=null)
		{
			System.out.println(pq.poll());
		}
	}
}
