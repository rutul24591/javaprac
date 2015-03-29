package random;

public class Random2 
{
public String ReverseString(String str)
	{
		int length = str.length();
		String original = str;
		String reverse = "";
		for(int a = length-1; a>=0; a--)
		{
			reverse = reverse + original.charAt(a);			
		}		
	return reverse;
	 }
public static void main(String[] args)
	{	
		Random2 rs = new Random2();
		System.out.println("Reversed string is:"+rs.ReverseString(" This is a string"));
	}
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	