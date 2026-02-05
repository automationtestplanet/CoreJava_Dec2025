package oop.abstraction;

public class ImplementIterface1 implements Interface1 {

	@Override
	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));

	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division of " + a + " and " + b + " = " + (a / b));

	}

	public static void main(String[] args) {
		Interface1 inf1 = new ImplementIterface1();
		inf1.addition(10, 20);
		System.out.println(inf1.subtraction(10, 3));
		inf1.multiplication(10, 20);
		inf1.division(10, 3);
	}

}
