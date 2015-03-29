package random;

import java.io.*;
import java.net.*;

public class UrlReader {

	public static void main(String args[]) throws Exception
	{
		URL u =new URL("http://www.whitehouse.gov/");
		InputStream ins= u.openStream();
		InputStreamReader isr= new InputStreamReader(ins);
		BufferedReader WhiteHouse= new BufferedReader(isr);
		System.out.println( WhiteHouse.readLine());
		
	}
}
