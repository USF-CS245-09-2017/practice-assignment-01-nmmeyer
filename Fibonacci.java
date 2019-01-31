/**
 * 
 */
/**
 * @author nataliemeyer
 *
 */

public class Fibonacci 
{ 


	public int fib_iterative(int n)
	{	
		if(n==0)
		{
			return n; 
		}
		int current = 1; 
		int previous = 0; 
		for (int i = 2; i<n; i++)
		{
			int next = current + previous;
			previous = current;
			current = next; 
		}
		return current + previous; 
	}


	public int fibonacci (int n)
	{
		if (n <= 1) 
		{ 
			return n; 
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}
}
	

