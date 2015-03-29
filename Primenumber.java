package random;


import java.util.ArrayList;
import javax.jws.WebService;

@WebService
public class Primenumber {

	public Primenumber() {}
	
	//Check if a given number is prime or not
	public boolean checkPrime(Integer number) {
		//Check if the number is even, if its even, its not prime
		if (number > 2 && number % 2 == 0)
			return false;
		
		//If the number is odd, check if it is divisible by any other odd
		for(int i=3; i<number; i=i+2) {
			if(number%i == 0)
				return false;
		}
		//Number is prime if reaches here
		return true;
	}
	
	//Find all the prime numbers between 2 to the given number
	public String findPrime(Integer number) {
		//Create an array list for storing list of prime numbers
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		//Add items to the list if the number is prime
		for(int i=2; i<= number; i++) {
			if(checkPrime(i))
				primeNumbers.add(i);
		}
		//Return string for the prime number
		return primeNumbers.toString();
	}
	
	//Generate response string for checking prime number
	public String isPrime(Integer number) {
		String ans="";
		
		if(number < 1) {
			ans = "Entered number should be greater than 1.";
		} else {
			if(checkPrime(number))
				ans = "Your number: " + number + " is a Prime number.";
			else
				ans = "Your number: " + number + " is not a Prime number.";
		}
		return ans;
	}
}