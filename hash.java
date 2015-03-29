package random;

import java.util.*;

public class hash {
	public static void main(String args[]) throws Exception{
		Hashtable hash= new Hashtable(10,10);
		for(int i=0;i<=100;i++)
		{
			Integer integer= new Integer(i);
			hash.put(integer,"number:"+i);
		}
		
		System.out.println(hash.get(new Integer(6)));
		System.out.println(hash.get(new Integer(80)));
		System.in.read();
	//	System.out.println("goodbye!!");
	for(Enumeration e = hash.keys(); e.hasMoreElements();)
	{
		System.out.println(hash.get(e.nextElement()));
		System.out.println("goodbye!!");
	}
	}

}
