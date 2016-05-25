package c08;
import java.util.*;

public class SortVector extends Vector {
	private Compare compare; //To hold the callback
	public SortVector(Compare comp)
	{
		compare = comp;
	}
	public void sort()
	{
		quickSort(0,size() - 1);
	}
	
	private void quickSort(int left, int right)
	{
		if(right > left)
		{
			Object o1 = elementAt(right);
			int i = left - 1;
			int j = right;
			while(true)
			{
				//从左往右查找，直到找到一个数比最右的值大的元素
				while(compare.lessThan(elementAt(++i),o1))
					;
				//从右往左查找，直到找到一个数比最右边的小或者等于的元素
				while(j > 0)
					if(compare.lessThanOrEqual(elementAt(--j),o1))
						break;
				//
				if(i >= j) break;
				swap(i, j);				
			}
			swap(i, right);
			quickSort(left, i-1);
			quickSort(i+1, right);
		}
	}
	private void swap(int loc1, int loc2)
	{
		Object temp = elementAt(loc1);
		setElementAt(elementAt(loc2),loc1);
		setElementAt(temp, loc2);
	}

	

}
