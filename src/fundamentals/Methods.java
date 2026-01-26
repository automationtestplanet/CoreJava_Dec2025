package fundamentals;

public class Methods {

	public static void addition() {
		int a = 100;
		int b = 200;
		System.out.println("Addition: " + (a + b));
	}

	public static void subtraction() {
		int a = 100;
		int b = 200;
		System.out.println("Subtraction: " + (a - b));
	}

	public static void multiplication() {
		int a = 100;
		int b = 200;
		System.out.println("Multiplication: " + (a * b));
	}

	public static void division() {
		int a = 10;
		int b = 3;
		System.out.println("Division: " + (a / b));
	}

	public static void modDivision() {
		int a = 10;
		int b = 3;
		System.out.println("Modular Division: " + (a % b));
	}

	public static void main(String[] args) {
		addition();
		addition();
		addition();
		addition();
//		multiplication();
//		int additionResult = addition();
//		multiplication(additionResult,3);
	}

}
