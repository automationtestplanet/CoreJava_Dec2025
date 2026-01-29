package oop.polymorphism;

public class Calculator {

	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	public void addition(float a, float b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	public void addition(String a, String b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	public void addition(int a, int b, int c) {
		System.out.println("Addition of " + a + " and " + b + " and " + c + " = " + (a + b + c));
	}

	public int subtraction(int a, int b) {
		return (a - b);
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("DIvisio of " + a + " and " + b + " = " + (a / b));
	}

}
