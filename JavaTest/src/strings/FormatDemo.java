package strings;

class Format
{
	int number = 6;
	long longnumber = 54545454;
	float value = 4.56f;
	double result = 45.454;
	
	public String toString()
	{
		return String.format("%8d  %8d%8f%8f", number,longnumber,value,result);
	}
}

public class FormatDemo 
{
	public static void main(String[] args)
	{
		Format f = new Format();
		System.out.println(f);
	}
}
