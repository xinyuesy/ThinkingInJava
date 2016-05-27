package access;

public class ConnectionManager {
	
	private static Connection[] clist = new Connection[10];
	ConnectionManager()
	{
		for(int i = 0; i < 10; i++)
		{
			clist[i] = new Connection();
		}
	}

}
