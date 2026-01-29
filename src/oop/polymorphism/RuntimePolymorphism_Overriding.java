package oop.polymorphism;

public class RuntimePolymorphism_Overriding extends Calculator {

	public void modDivision(int a, int b) {
		System.out.println("Modular Division of " + a + " and " + b + " = " + (a % b));
	}
	
	@Override   // annotation
	public int subtraction(int a, int b) {
		return (a-b)-5;
	}
	
	public static void main(String[] args) {
		RuntimePolymorphism_Overriding overriding = new RuntimePolymorphism_Overriding();
		System.out.println("Subtraction of 10 and 20 = " + overriding.subtraction(100, 20));
		overriding.modDivision(10, 3);

	}

}
