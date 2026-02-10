package exceptions;

public class HandlingMultipleExceptionWithMultipleCatchBlocks {

	public void display() {
		System.out.println("This is DIsplay Method");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------Proram Execcution Started----------------");

		int a = 100;
		int b = 10;
		int[] intARr = { 10, 20, 30 };
		String str1 = "Hello";
		String str2 = null;
		HandlingMultipleExceptionWithMultipleCatchBlocks excEx = null;

		try {
			System.out.println("Division: " + (a / b));
			System.out.println("Division is Executed");
			System.out.println(intARr[2]);
			System.out.println(str1.charAt(4));
			System.out.println("Java".toUpperCase());
			new HandlingMultipleExceptionWithMultipleCatchBlocks().display();
		} catch (ArithmeticException are) {
			System.out.println("Divisble by zero is not possible");
		} catch (ArrayIndexOutOfBoundsException arEx) {
			System.out.println("Array is having maximum index: " + (intARr.length - 1));
		} catch (StringIndexOutOfBoundsException strEx) {
			System.out.println("String is having maximum index: " + (str1.length() - 1));
		} catch (NullPointerException nulEx) {
			System.out.println("Can not perform any operation on null");
		}

		Thread.sleep(3000);

		System.out.println("Addition: " + (a + b));

		System.out.println("--------Proram Execcution Ended----------------");

	}

}
