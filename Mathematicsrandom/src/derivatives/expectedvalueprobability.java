package derivatives;
// Java code to calculate expected 
// value of an array 
import java.io.*; 

class GFG 
{ 
	// Function to calculate expectation 
	static float calc_Expectation(float a[], float n) 
	{ 
		// Variable prb is for probability of each 
		// element which is same for each element 
		float prb = (1 / n); 
	
		// calculating expectation overall 
		float sum = 0; 
		for (int i = 0; i < n; i++) 
			sum += a[i] * prb; 

		// returning expectation as sum 
		return sum; 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		float expect, n = 6f; 
		float a[] = { 1f, 2f, 3f, 
					4f, 5f, 6f }; 
		
		// Function for calculating expectation 
		expect = calc_Expectation(a, n); 
		
		// Display expectation of given array 
		System.out.println("Expectation of array E(X) is : "
						+ expect); 
	} 
} 

// This code is contributed by Anshika Goyal. 


