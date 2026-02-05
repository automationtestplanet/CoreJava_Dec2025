package oop.polymorphism;

public class NewCalculator extends Calculator {

	public void modDivision(int a, int b) {
		System.out.println("Modular Division Remainder: " + (a % b));
	}
	
	@Override   // annotation
	public int subtraction(int a, int b) {
		return super.subtraction(a, b)-5;
	}
}
