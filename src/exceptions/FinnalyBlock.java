package exceptions;

public class FinnalyBlock {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
//		try {
//			System.out.println("Division: " + (a / b));
//		} catch (Exception e) {
//			System.out.println("Reason for Exception is: " + e.getMessage());
//		} finally {
//			System.out.println("Finally block is Executed");
//		}

		try {
			System.out.println("Database Connection Opened");
			System.out.println("Division: " + (a / b));
		} catch (Exception e) {
			System.out.println("Reason for Exception is: " + e.getMessage());
		} finally {
			System.out.println("Database Connection closed");
		}
	}

}
