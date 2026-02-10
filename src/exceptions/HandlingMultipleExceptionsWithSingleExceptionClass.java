package exceptions;

public class HandlingMultipleExceptionsWithSingleExceptionClass {

	public void display() {
		System.out.println("This is DIsplay Method");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------Proram Execcution Started----------------");

		int a = 100;
		int b = 10;
		int[] intARr = { 10, 20, 30 };
		String str1 = "Hello";
		String str2 = "Java";
		HandlingMultipleExceptionsWithSingleExceptionClass excEx = new HandlingMultipleExceptionsWithSingleExceptionClass();

		try {
			System.out.println("Division: " + (a / b));
//			Exception arEx = new ArithmeticException();
			
			System.out.println(intARr[2]);
//			Exception arIndEx = new ArrayIndexOutOfBoundsException();
			
			System.out.println(str1.charAt(4));
//			Exception strIndEx = new StringIndexOutOfBoundsException();
			
			System.out.println(str2.toUpperCase());
//			Exception nulEx = new NullPointerException();
			
			excEx.display();
			
		} catch (Exception ex) {
			System.out.println("Reason for erro is: " + ex.getMessage());
		}

		Thread.sleep(3000);

		System.out.println("Addition: " + (a + b));

		System.out.println("--------Proram Execcution Ended----------------");

	}

}
