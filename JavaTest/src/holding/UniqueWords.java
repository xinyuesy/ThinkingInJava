package holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWords
{
	public static void main(String[] args)
	{
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("D:\\java\\document.txt", "\\W+"));
		System.out.println(words);
		// Set<Character> vowel = new
		// TreeSet<Character>(Arrays.asList('a','e','i','o','u'));
		Map<Character, Integer> vowel = new HashMap<Character, Integer>();
		vowel.put('a', 0);
		vowel.put('e', 0);
		vowel.put('i', 0);
		vowel.put('o', 0);
		vowel.put('u', 0);
		System.out.println(vowel);
		Iterator<String> it = words.iterator();
		int count = 0;
		int total = 0;
		int temp = 0;
		String word;
		while (it.hasNext())
		{
			count = 0;
			word = it.next();
			for (Character c : vowel.keySet())
			{
				temp = vowel.get(c);
				if (word.indexOf(c) != -1)
				{
					vowel.put(c, ++temp);
					count++;
					total++;
				}
			}
			System.out.println(word + ": " + count);
		}
		System.out.println("vowel: " + total);
		System.out.println(vowel);

	}
}
