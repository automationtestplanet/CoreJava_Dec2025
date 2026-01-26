package access.modifiers;

public class ArithematicOperations {
	
	public int a = 100;
	protected char ch = 'A';
	float float1 = 100.5F;
	private String str = "Hello";

	public void addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	protected void subtraction(int a, int b) {
		System.out.println("Subtraction: " + (a - b));
	}

	void multiplication(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	private void division(int a, int b) {
		System.out.println("Division: " + (a / b));
	}

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		arOp.addition(10, 20);				// public accessed
		arOp.subtraction(100, 20);			// protected accessed
		arOp.multiplication(10, 20);		// default accessed
		arOp.division(10, 3);				// private accessed
	}

}
