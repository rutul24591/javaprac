package random;

import java.io.*;

public class homework1part2 {

	public static void main(String Args[]) throws Exception{
		
	
	BufferedReader keyboard;
	String input;
	
	keyboard= new BufferedReader(new InputStreamReader(System.in));
	input= keyboard.readLine();
	
	input= input.charAt(0) + input.substring(2);
	System.out.println(input);
	
	}
}
