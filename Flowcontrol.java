package random;

public class Flowcontrol {

	public static void main(String[] args) 
{
		int month =7;
		String season;
		
		if( month ==11 || month == 12 || month == 1 || month == 2)
		    {
			 season = "winter";
			}
		else if(month == 3 || month == 4 || month == 5 || month == 6)
		    {
			 season = " summer";
		    }
		else if(month == 7 || month == 8 || month == 9 || month == 10)
		    {
			 season = " monsoon";
		    }
		else
			{
			 season ="not a valid season";
		    }
		System.out.println("july is in the" + season +"");
	}

}

