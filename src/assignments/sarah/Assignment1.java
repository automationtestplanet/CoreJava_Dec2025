package assignments.sarah;

public class Assignment1 {
	
	// Write a reusable Java Program print the factorial of a number
	// Ex: 5 -> 5 X 4 X 3 X 2 X 1 = 120
	
	public static int factorial(int n) { //declaring method as static and can be reused. using int instead of void coz we want to return the result
		 
		int factorial =1;   //declaring int factorial to store factorial result
		
		System.out.print("Factorial of " + n + " = "); //my initial print. writing before for loop as i want it to write it only once
		//using print option instead of println as I want print to be on same line
		
		for (int i=n; i>=1; --i)  { //using for loop and using numbers from i=n to i=1, so that we can the result in descending order
			factorial *= i;   //declaring factorial function
			
			System.out.print(i); //printing i starts
			
			if (i>1) {
				System.out.print(" X "); //printing X symbol
			}
			 
		}
		 return factorial;  //returning factorial value
			 
	}

	public static void main(String[] args) { //main method
		
		int n=5;  //n is any number I want to print
		
		int result = factorial(n);  //calling factorial method and storing the result here
		
				
			System.out.println( " = " + result); //print: factorial of n = result

	}

}
		
		


