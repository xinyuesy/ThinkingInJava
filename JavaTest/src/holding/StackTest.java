package holding;

public class StackTest 
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		for(String s: "My dog has fleas".split(" "))
			stack.push(s);
		while(!stack.empty())
			System.out.println(stack.pop() + " ");
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		Stack<Character> stackcal = new Stack<Character>();
		Character c;
		for(int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			
			if(c.equals('+'))
				stackcal.push(s.charAt(++i));
			else if(c.equals('-'))
			{
				System.out.print(stackcal.pop());
			}
			//stackcal.push(s.charAt(i));
			//System.out.println(s.charAt(i));
		}
		
	}
}
