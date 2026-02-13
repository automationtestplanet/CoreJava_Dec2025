package oop.abstraction;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		System.out.println("-----------------------Function----------------------");
		Function<Integer, String> function1 = new Function<Integer, String>() {
			@Override
			public String apply(Integer val1) {
				return "Hello";
			}
		};
		System.out.println(function1.apply(100));
		
		Function<Integer, String> function2 = val1 -> "Java";
		System.out.println(function2.apply(200));
		
		System.out.println("-----------------------Bi-Function----------------------");
		BiFunction<Integer, Integer, Integer> biFunction1 = new BiFunction<>() {
			@Override
			public Integer apply(Integer val1, Integer val2) {
				return val1+val2;
			}
		};
		System.out.println(biFunction1.apply(100, 200));
		
		BiFunction<Integer, Integer, Integer> biFunction2 = (val1, val2)-> val1+val2;
		System.out.println(biFunction2.apply(1000, 2000));
		
		System.out.println("-----------------------BinaryOperator----------------------");
		BinaryOperator<String> binaryOperator1 = new BinaryOperator<String>() {
			@Override
			public String apply(String str1, String str2) {
				return str1+str2;
			}
		};
		System.out.println(binaryOperator1.apply("Hello", "Java"));
		
		BinaryOperator<String> binaryOperator2 = (str1,str2)-> str1+str2;
		System.out.println(binaryOperator2.apply("Hello", "World"));
		
		System.out.println("-----------------------Predicate----------------------");
		Predicate<Integer> predicate1 = new Predicate<Integer>() {			
			@Override
			public boolean test(Integer val1) {
				return val1%2==0;
			}
		};		
		System.out.println(predicate1.test(100));
		System.out.println(predicate1.test(99));
		
		Predicate<String> predicate2 = str1 -> str1.equals("Hello");
		System.out.println(predicate2.test("Hello"));
		System.out.println(predicate2.test("Java"));
		
		System.out.println("-----------------------Consumer----------------------");
		Consumer<Integer> consumer1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer val1) {
				System.out.println(val1);
			}
		};
		consumer1.accept(1000);
		
		Consumer<Integer> consumer2 = val1 -> System.out.println(val1);
		consumer2.accept(2000);
		
		System.out.println("-----------------------Supplier----------------------");
		Supplier<String> supplier1 = new Supplier<String>() {
			@Override
			public String get() {
				return "Java";
			}
		};
		System.out.println(supplier1.get());
		
		Supplier<String> supplier2 = () -> "Hello";
		System.out.println(supplier2.get());
		
		
		System.out.println("-----------------------Comparator----------------------");
		Comparator<Integer> comparator1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer val1, Integer val2) {
				if(val1>val2) return 0;
				else return -1;
			}
		};
		System.out.println(comparator1.compare(10, 20));
		
		Comparator<Integer> comparator2 = new Comparator<Integer>() {
			@Override
			public int compare(Integer val1, Integer val2) {
				return Integer.compare(val1, val2);
			}
		};
		System.out.println(comparator2.compare(10, 20));
		
		Comparator<Integer> comparator3 = (val1,val2) -> Integer.compare(val1, val2);
		System.out.println(comparator3.compare(20, 10));
	}

}
