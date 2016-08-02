package strings;

public class Replacing 
{
	static String s = Splitting.knights;
	public static void main(String[] args)
	{
		String s1 = "Java now has regular expression";
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
		System.out.println("Djfkdjfda".matches("^[A-Z][a-zA-Z]+[a]$"));
		System.out.println("acc".matches("[a-z]{3}"));
		System.out.println("18628030208".matches("^1[3|4|5|8][0-9]\\d{8}$"));
		System.out.println(s.replaceAll("[aeiou]","_"));
		
		System.out.println(s1.matches("^Java"));
		System.out.println(s1.matches("\\Breg.*"));
		System.out.println(s1.matches("n.w\\s+h(a|i)s"));
		System.out.println(s1.matches("s?"));
		String res = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		String s2 = "Arline ate eight apples and one orange while ANita hadn't any";
		System.out.println(s2.matches(res));
	}
}
