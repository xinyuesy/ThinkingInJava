package innerclasses;

interface Selector 
{
	boolean end();
	Object current();
	void next();
	Sequence sequenceRef();
}
interface ReverseSelector
{
	boolean start();
	Object current();
	void previous();
	Sequence sequenceRef();
}
class MyString
{
	String name= "MyString";
	public String toString()
	{
		return name;
	}
}
public class Sequence 
{
	private Object[] items;
	private int next = 0;
	private String address = "Beijing";
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x)
	{
		if(next < items.length)
			items[next++] = x;
	}
	
	private class SequenceSelector implements Selector
	{
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; }
		public String toString() { return address; }
		public Sequence sequenceRef() { return Sequence.this; }
	}
	private class ReverseSequenceSelector implements ReverseSelector
	{

		private int i = items.length;
		public boolean start() { return i == 0; }
		public Object current() { return items[i-1]; }
		public Sequence sequenceRef() { return Sequence.this; }
		public void previous() { if(i > 0 ) i--; }
		public String toString() { return "ReverseSequenceSelector"; }

		
		
	}
	public void print() { System.out.println("Sequence"); }
	public Selector selector()
	{
		return new SequenceSelector();
	}
	public ReverseSelector reverseSelector()
	{
		return new ReverseSequenceSelector();
	}
	public static void main(String[] args)
	{
		Sequence sequence = new Sequence(10);
		Sequence sequence1 = new Sequence(10);
		for(int i = 0; i < 10; i++)
			sequence1.add(new MyString().toString());
		Selector selector1 = sequence1.selector();
		selector1.sequenceRef().print();
		
		while(!selector1.end())
		{
			System.out.println(selector1.current());
			selector1.next();
		}
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end())
		{
			System.out.println(selector.current() + " " + selector.toString());
			selector.next();
		}
		ReverseSelector reverseSelector = sequence.reverseSelector();
		while(!reverseSelector.start())
		{
			System.out.println(reverseSelector.current() + " " + reverseSelector.toString());
			reverseSelector.previous();
		}
		
		
	}
}
