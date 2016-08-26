package c08;

import java.util.*;

public class AssocArray extends Dictionary
{
	private Vector keys = new Vector();
	private Vector values = new Vector();

	public int size()
	{
		return keys.size();
	}

	public boolean isEmpty()
	{
		return keys.isEmpty();
	}

	public Object put(Object key, Object value)
	{
		keys.addElement(key);
		values.addElement(value);
		return key;
	}

	public Object get(Object key)
	{
		int index = keys.indexOf(key);
		if (index == -1)
			return null;
		return values.elementAt(index);
	}

	public Object remove(Object key)
	{
		int index = keys.indexOf(key);
		if (index == -1)
			return null;
		else
		{
			// keys.elementAt(index) = -1;
			keys.removeElementAt(index);
			Object returnval = values.elementAt(index);
			values.removeElementAt(index);
			return returnval;
		}
	}

	public Enumeration keys()
	{
		return keys.elements();
	}

	public Enumeration elements()
	{
		return values.elements();
	}

	public static void main(String[] args)
	{
		AssocArray aa = new AssocArray();
		for (char c = 'a'; c <= 'z'; c++)
			aa.put(String.valueOf(c), Integer.valueOf(c));
		// System.out.println(aa.elements());

		char[] ca =
		{ 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < ca.length; i++)
			System.out.println("Value of character: " + aa.get(String.valueOf(ca[i])));
		Enumeration aachar = aa.elements();
		while (aachar.hasMoreElements())
			System.out.println(aachar.nextElement());

	}

}
