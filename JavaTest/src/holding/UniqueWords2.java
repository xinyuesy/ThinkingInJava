package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import net.mindview.util.TextFile;


public class UniqueWords2 
{
	public static void main(String[] args)
	{
		List<String> words = new ArrayList<String>();
		words.addAll(new TextFile("D:\\java\\document.txt","\\W+"));
		Set<String> wordsset = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		wordsset.addAll(new TextFile("D:\\java\\document.txt","\\W+"));
		Map<String,Integer> wordscount = new HashMap<String,Integer>();
		Iterator<String> it = words.iterator();
		String temp;
		//int count = 0;

		while(it.hasNext())
		{
			temp = it.next();
			//count = wordscount.get(temp);
			wordscount.put(temp, wordscount.get(temp)==null?1:wordscount.get(temp)+1);
		}
		//Collections.sort(wordscount);
		TreeMap<String,Integer> treemap = new TreeMap<String,Integer>(wordscount);
		System.out.println(wordscount);
		System.out.println(treemap);
		for(String s: treemap.keySet())
			System.out.println(s + ": " + treemap.get(s));
	}
}
