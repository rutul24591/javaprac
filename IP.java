package random;

import java.net.InetAddress;
import java.net.URL;

public class IP 
{
	public static void main(String args[]) throws Exception 
	{
		
	try
	{
	URL url= new URL("http://ping.com");
	System.out.println("Host is "+url.getHost());
	InetAddress address= InetAddress.getByName(url.getHost());
	System.out.println("the IP address of "+address.toString());
					 
	}
catch(Exception exc)
	{
	System.out.println("error in initializing-"+ exc.toString());
	
	}
}
	
}	
	
	
	
	
	
	
	
	

