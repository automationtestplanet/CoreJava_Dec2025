package exceptions;

public class ExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------Proram Execcution Started----------------");

		int a = 100;
		int b = 0;

		System.out.println("Division: " + (a / b));

		Thread.sleep(3000);

		System.out.println("Addition: " + (a + b));

		System.out.println("--------Proram Execcution Ended----------------");

	}

}
