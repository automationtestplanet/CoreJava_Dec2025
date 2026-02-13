package oop.abstraction;

public class LambdaExpression {

	public static void main(String[] args) {

		FunctionalInterface1 funInf1_1 = (str) -> System.out.println("Priting Value: " + str);
		funInf1_1.printVlaue("Java");

		FunctionalInterface1 funInf1_2 = str -> System.out.println("Priting Value: " + str);
		funInf1_2.printVlaue("Hello Java");

		System.out.println("--------------------------------------------------------");
		FunctionalInterface2 funInf2_2 = a -> a;
		System.out.println("Given Value: " + funInf2_2.getValue(10000));

		System.out.println("--------------------------------------------------------");
		FunctionalInterface3 funInf3_1 = (a, b) -> System.out.println("Addition: " + (a + b));
		funInf3_1.addition(1000, 2000);

		System.out.println("--------------------------------------------------------");
		FunctionalInterface4 funInf4_1 = (a, b) -> a * b;
		System.out.println("Multiplication: " + funInf4_1.multiplication(100, 200));

	}

}
