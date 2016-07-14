package holding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Statistics 
{
	public static void main(String[] args)
	{
		Map<Integer,Integer> data = new HashMap<Integer,Integer>();
		Map<Integer,Map<Integer,Integer>> result = new HashMap<Integer,Map<Integer,Integer>>();
		for(int j = 0; j < 10; j++)
		{
			Random rand = new Random(System.currentTimeMillis());
			//data = new HashMap<Integer,Integer>();
			for(int i = 0; i < 10000; i++)
			{
				int temp = rand.nextInt(20);
				data.put(temp,data.get(temp)==null?1:data.get(temp)+1);
				//if(data.get(temp)==null)
				//	data.put(temp, 1);
				//else
				//	data.put(temp, data.get(temp)+1);
			}
			result.put(j, data);
			System.out.println(data);
		}
		System.out.println(result);
		//for(int i = 0; i < data.size(); i++)
			//System.out.println(i + ": " + data.get(i));
		for(Integer i : result.keySet())
		{
			result.get(i).keySet();
		}
	}
}
