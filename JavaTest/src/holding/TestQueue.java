package holding;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue 
{	
	public static void main(String[] args)
	{
		Queue<Command> q = FillQueue.fill();
		while(q.peek() != null)
			System.out.println(q.remove() + " ");
		System.out.println();
	}
}


class Command
{
	private String s;
	Command(String s)
	{
		this.s = s;
	}
	public void operation()
	{
		System.out.println(s);
	}
	public String toString()
	{
		return s;
	}
}

class FillQueue
{
	public static Queue fill()
	{
		Queue<Command> q = new LinkedList<Command>();
		q.add(new Command("ls"));
		q.add(new Command("pwd"));
		q.add(new Command("cd"));
		return q;
	}
}