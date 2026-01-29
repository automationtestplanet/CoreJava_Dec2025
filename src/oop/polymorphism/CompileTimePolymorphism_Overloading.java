package oop.polymorphism;

public class CompileTimePolymorphism_Overloading {

	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

//	public void addition(int a, int b) {  // method signature
//		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
//	}

	public void addition(float a, float b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	public void addition(String a, String b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	public void addition(int a, int b, int c) {
		System.out.println("Addition of " + a + " and " + b + " and " + c + " = " + (a + b + c));
	}

	public void addition(int a, int b, int c, int d) {
		System.out.println("Addition of " + a + " and " + b + " and " + c + " and " + d + " = " + (a + b + c + d));
	}
	
	public void addition(int ...a) { // VarArgs
		int sum = 0;
		for(int eachVal :a) {
			sum+=eachVal;
		}
		System.out.println("Addition of all Numbers: "+sum);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism_Overloading overload = new CompileTimePolymorphism_Overloading();

		overload.addition(10, 20);
		overload.addition(10.5f, 20.5f);
		overload.addition("Hello", "Java");
		overload.addition(10, 20, 30);
		overload.addition(10, 20, 30,40);
		overload.addition(10, 20, 30,40,50);
		overload.addition(10, 20, 30,40,50,60);
		overload.addition(10, 20, 30,40,50,60,70);
		overload.addition(10, 20, 30,40,50,60,70,80);
		overload.addition(10, 20, 30,40,50,60,70,80,90);
		overload.addition(10, 20, 30,40,50,60,70,80,90,100);

	}

}
