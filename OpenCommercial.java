package random;

import java.io.*;
import java.net.*;

class OpenCommercial{
	public static void main(String args[]) throws Exception{
		BufferedReader Keyboard;
		String inputLine;

		Keyboard= new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.print("Please enter the name of a company (without spaces): ");
            System.out.flush();        
            inputLine = Keyboard.readLine();
        }while(inputLine.length() == 0);

        URL u= new URL("http://www." + inputLine + ".com");
        String[] inLines = new String[lines_to_read];
        try{
        	InputStream ins= u.openStream();
        	InputStreamReader isr= new InputStreamReader(ins);
        	BufferedReader website= new BufferedReader(isr);
        	for(int i=0;i< lines_to_read; i++)
        		{
        			inLines[i]= website.readLine();
        		}
           }
        	catch (IOException e)
        	 {
        		throw new Exception(e);
        	 }
        for(int i=0;i < lines_to_read; i++)
        {
        	int reverseIndex = lines_to_read - i - 1;
        	System.out.println(inLines[reverseIndex]);
		}
	}
	private static final int lines_to_read=5;
}