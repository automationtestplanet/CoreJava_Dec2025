package calculator;

class ImplementsCalculator implements Calculator {
	@Override
	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println("Subtraction of " + a + " and " + b + " = " + (a - b));
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));

	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division of " + a + " and " + b + " = " + (a / b));

	}

}
