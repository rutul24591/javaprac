package random;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Reverse 
{

	public static void main(String[] args) 
	{
		Integer[] values = {3,4,7,2,8,6,10};
		Deque<Integer> numberStack= new ArrayDeque<Integer>(10);
		
		for(int i=0; i< values.length; i++)
		    {
				numberStack.push(values[i]);
		    }
			Integer[] valuesReversed = new Integer[values.length];
			
			int i=0;
			while(!numberStack.isEmpty())
			{
				valuesReversed[i++]= numberStack.pop();
			}
	System.out.println(Arrays.deepToString(valuesReversed));
	
	}

}
