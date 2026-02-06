package assignments.sarah;

public class Assignment1 {
	
	// Write a reusable Java Program print the factorial of a number
	// Ex: 5 -> 5 X 4 X 3 X 2 X 1 = 120
	
	public static int factorial(int n) { 
		int factorial =1;   		
		for (int i=n; i>=1; --i)  { 
			factorial *= i;   
		}
		 return factorial; 		 
	}
	public static void main(String[] args) { 
			System.out.println( "Factorial of value 5 = " + factorial(5));
	}
}
		
		


