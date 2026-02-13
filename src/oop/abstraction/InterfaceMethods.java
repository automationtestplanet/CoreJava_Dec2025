package oop.abstraction;

@FunctionalInterface
public interface InterfaceMethods {
	void addition(int a, int b);
	
	static void subtraction(int a, int b) {
		System.out.println("Subtraction: "+ (a-b));
	}
	
	default void multiplication(int a, int b) {
		System.out.println("Subtraction: "+ (a*b));
	}
	
	public static void main(String[] args) {
		InterfaceMethods.subtraction(10, 3);
		
//		InterfaceMethods.multiplication(10,3);
		
		InterfaceMethods infMethd = (a,b)-> System.out.println("Addition: "+(a+b));
		infMethd.addition(20, 30);
		infMethd.multiplication(10, 3);
	}

}
