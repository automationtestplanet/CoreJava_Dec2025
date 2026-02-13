package oop.abstraction;

public class AccessFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterface1 funInf1 = new FunctionalInterface1() {
			@Override
			public void printVlaue(String str) {
				System.out.println("Priting Value: " + str);

			}
		};
		funInf1.printVlaue("Hello");

		FunctionalInterface1 funInf1_1 = (str) -> System.out.println("Priting Value: " + str);
		funInf1_1.printVlaue("Java");

		FunctionalInterface1 funInf1_2 = str -> System.out.println("Priting Value: " + str);
		funInf1_2.printVlaue("Hello Java");

		System.out.println("--------------------------------------------------------");
		FunctionalInterface2 funInf2 = new FunctionalInterface2() {
			@Override
			public int getValue(int a) {
				return a;
			}
		};
		System.out.println("Given Value: "+funInf2.getValue(100));
		
		FunctionalInterface2 funInf2_1 = a -> {return a;};
		System.out.println("Given Value: "+funInf2_1.getValue(1000));
		
		FunctionalInterface2 funInf2_2 = a -> a;
		System.out.println("Given Value: "+funInf2_2.getValue(10000));
		
		System.out.println("--------------------------------------------------------");
		
		FunctionalInterface3 funInf3 = new FunctionalInterface3() {			
			@Override
			public void addition(int a, int b) {
				System.out.println("Addition: "+ (a+b));
			}
		};
		funInf3.addition(100, 200);
		
		FunctionalInterface3 funInf3_1 = (a,b)-> System.out.println("Addition: "+ (a+b));
		funInf3_1.addition(1000, 2000);
		
		System.out.println("--------------------------------------------------------");
		FunctionalInterface4 funInf4 = new FunctionalInterface4() {			
			@Override
			public int multiplication(int a, int b) {
				return a*b;
			}
		};
		System.out.println("Multiplication: "+funInf4.multiplication(10, 20));
		
		FunctionalInterface4 funInf4_1 = (a,b) -> a*b;
		System.out.println("Multiplication: "+funInf4_1.multiplication(100, 200));

	}

}
