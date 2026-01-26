package fundamentals;

public class ConditionalStatements {

	public static  void displayNumber(int number) {
		if(number > 100) {
			System.out.println(number);
		}
		
		if(number > 100) {
			System.out.println(number);
		}else {
			System.out.println("The given number "+number+" is not greater than 100");
		}
		
		if(number > 100) {
			System.out.println(number);
		}else if(number==100 ) {
			System.out.println("The given number "+number+" is equals 100");
		}else {
			System.out.println("The given number "+number+" is not greater than 100");
		}
		
		if(number > 100) {
			if(number <= 200) {
				System.out.println(number);
			}else {
				System.out.println(number+ " is greater than 200, can not be printed");
			}
		}else {
			System.out.println("The given number "+number+" is not greater than 100");
		}
	}
	
	public static  void displayFruits(String fruitName) {
		switch(fruitName) {
		case "APPLE":
			System.out.println(fruitName+" quantiy 10 available");
			break;
		case "BANANA":
			System.out.println(fruitName+" quantiy 20 available");
			break;
		case "CHERRY":
			System.out.println(fruitName+" quantiy 100 available");
			break;
		default: 
			System.out.println(fruitName+ " is not found ");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {		
//		displayNumber(201);
		displayFruits("BANANA");
	}

}
