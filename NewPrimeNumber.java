package week1.day1;

public class NewPrimeNumber {
public static void main(String[] args) {
	// Declare an int Input and assign a value 13
	int n=13;
	 //Declare a boolean variable flag as false
	boolean flag= false;
	// Iterate from 2 to half of the input
	
	for(int i=2; i<=13/2; i++)
	{
		// Divide the input with each for loop variable and check the remainder
		if (n%i==0)
		{
			// Set the flag as true when there is no remainder
			flag=true;
			System.out.println("Not a Prime Number");
			 //break the iterator
break;
		}
	}
	// Check the flag (Provide a condition)
		if (n!=0)
			flag=false;
	System.out.println("Prime number");
	else
		System.out.println("Not a prime number");
	}
	
}

