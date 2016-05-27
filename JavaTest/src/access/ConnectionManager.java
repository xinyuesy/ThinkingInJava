package access;

public class ConnectionManager {
	
	private static Connection[] clist = new Connection[10];
	private ConnectionManager()
	{
		for(int i = 0; i < 10; i++)
		{
			clist[i] = new Connection();
		}
	}
	
	public int getObjNumber()
	{
		int count = 0;
		for(int i = 0; i < clist.length; i++)
		{
			if(clist[i]!=null)
				count++;
		}
		return count;
	}
	public static ConnectionManager createObject()
	{
		return new ConnectionManager();
	}
	public Connection getObj(int i)
	{
		
		if(i>=0 && i < clist.length)
			return clist[i];
		else
		{
			System.out.println("index i out of range");
			return null;
		}
	}
	
	public static void main(String[] args)
	{
		ConnectionManager connection = createObject();
		for(int i = 0; i < connection.getObjNumber(); i++)
		{
			Connection temp = connection.getObj(i);
			System.out.println(temp + "\t" + temp.getValue1() + "\t" + temp.getValue2());
		}
	}

}
