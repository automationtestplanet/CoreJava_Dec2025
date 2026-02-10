package exceptions;

public class HandlingMultipleExceptionsWithMultipleTryCatchBlocks {

	public void display() {
		System.out.println("This is DIsplay Method");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------Proram Execcution Started----------------");

		int a = 100;
		int b = 0;
		int[] intARr = { 10, 20, 30 };
		String str1 = "Hello";
		String str2 = null;
		HandlingMultipleExceptionsWithMultipleTryCatchBlocks excEx = null;

		try {
			System.out.println("Division: " + (a / b));
//			ArithmeticException are1 = new ArithmeticException();

		} catch (ArithmeticException are) {
//			System.out.println(are.getMessage());
//			System.out.println("Division: "+ (a/1));
			System.out.println("Divisble by zero is not possible");
		}

		try {
			System.out.println(intARr[3]);
		} catch (ArrayIndexOutOfBoundsException arEx) {
			System.out.println("Array is having maximum index: " + (intARr.length - 1));
		}

		try {
			System.out.println(str1.charAt(5));
		} catch (StringIndexOutOfBoundsException strEx) {
			System.out.println("String is having maximum index: " + (str1.length() - 1));
		}

		try {
			System.out.println(str2.toUpperCase()); // If perform any thing on null, we get NullPointerException
		} catch (NullPointerException nulEx) {
			System.out.println("Can not perform any operation on null");
		}

		try {
			excEx.display();
		} catch (NullPointerException nulEx) {
			System.out.println("Can not perform any operation on null");
		}

		Thread.sleep(3000);

		System.out.println("Addition: " + (a + b));

		System.out.println("--------Proram Execcution Ended----------------");

	}

}
