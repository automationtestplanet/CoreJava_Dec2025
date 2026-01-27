package assignments.raju;

public class Assignment1 {
	
	// Write a reusable Java Program to reverse a number
	public static void reverseNumber(int number) {
		System.out.println("Actual number: "+ number);
		int revNum = 0;
		
		while(number>0) {
			int remainder = number%10; // 5  // 5 // 1
			
			revNum = (revNum*10)+ remainder;  // 5 // 50+5 = 55  == 550+1 = 551
			
			number = number/10;   // 15  // 1	// 0
			
		}
		
		System.out.println("Reverse Number: "+ revNum);
		
	}

	public static void main(String[] args) {
		reverseNumber(155);
		
		reverseNumber(123);

	}

}
