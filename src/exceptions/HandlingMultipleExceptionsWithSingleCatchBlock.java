package exceptions;

public class HandlingMultipleExceptionsWithSingleCatchBlock {

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
		HandlingMultipleExceptionsWithSingleCatchBlock excEx = new HandlingMultipleExceptionsWithSingleCatchBlock();

		try {
			System.out.println("Division: " + (a / b));
			System.out.println("Division is Executed");
			System.out.println(intARr[2]);
			System.out.println(str1.charAt(4));
			System.out.println(str2.toUpperCase());
			excEx.display();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException
				| NullPointerException ex) {
			System.out.println("Reason for erro is: " + ex.getMessage());
		}

		Thread.sleep(3000);

		System.out.println("Addition: " + (a + b));

		System.out.println("--------Proram Execcution Ended----------------");

	}

}
