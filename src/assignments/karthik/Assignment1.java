package assignments.karthik;

public class Assignment1 {
	
	// Write a reusable Java Program to print the  prime numbers between the given range
		// Ex: 1 to 10  -> 1,2,3,5,7
		// Ex: 1 to 20  -> 1,2,3,5,7,11,13,17,19

	public static void primeNumbers(int start, int end) {
		
	
		for(int i= start; i<= end; i++) {
			int count = 0; 
			
			for(int j = 1; j<=i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i+ " ");
			}
		}
	}
	public static void main(String[] args) {
		
			int start = 1;
			int end = 100;
			primeNumbers(start,end);
	}

}
