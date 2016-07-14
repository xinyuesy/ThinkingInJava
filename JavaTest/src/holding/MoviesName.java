package holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MoviesName 
{
	static Collection fill(Collection<String> name)
	{
		name.add("Mad Max");
		name.add("Batman");
		name.add("IronMan");
		name.add("Furious");
		name.add("Pulp fiction");
		name.add("Furious");
		return name;
	}
	
	public static void main(String[] args)
	{
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
	}
}
