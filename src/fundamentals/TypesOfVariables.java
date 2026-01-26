package fundamentals;

public class TypesOfVariables {

	static int a = 100;
	static int b = 200;
	int c = 300; // instance variable

	TypesOfVariables() { // Constructor

	}

	TypesOfVariables(int a, int b) { // Constructor

	}

	public static void addition() {
		System.out.println("Addition: " + (a + b));
	}

	public static void subtraction() {
		int a = 400;
		int b = 600;
		System.out.println("Subtraction: " + (a - b));
	}

	public static void multiplication() {
		System.out.println("Multiplication: " + (a * b));
	}

	public static void division() {
		System.out.println("Division: " + (a / b));
	}

	public void modDivision() { // instance method
		System.out.println("Modular Division: " + (a % b));
	}

	public static void main(String[] args) {
		addition();
		subtraction();

		TypesOfVariables memory1 = new TypesOfVariables();

		memory1.modDivision(); // instance method
		memory1.c = 1000;
		System.out.println(memory1.c); // instance variable

		TypesOfVariables memory2 = new TypesOfVariables();

		memory2.modDivision(); // instance method
		System.out.println(memory2.c); // instance variable

		TypesOfVariables memory3 = new TypesOfVariables();

		memory3.modDivision(); // instance method
		System.out.println(memory3.c); // instance variable
	}

}
