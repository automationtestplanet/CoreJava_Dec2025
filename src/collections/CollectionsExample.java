package collections;

import exceptions.BankTransactions;

public class CollectionsExample {

	public void add(boolean bool1) {
		System.out.println(bool1);
	}

	public void add(byte byte1) {
		System.out.println(byte1);
	}

	public void add(short short1) {
		System.out.println(short1);
	}

	public void add(int int1) {
		System.out.println(int1);
	}

	public void add(long long1) {
		System.out.println(long1);
	}

	public void add(float float1) {
		System.out.println(float1);
	}

	public void add(double double1) {
		System.out.println(double1);
	}

	public void add(char char1) {
		System.out.println(char1);
	}

	public void add(String str1) {
		System.out.println(str1);
	}

	public void add(CollectionsExample collEx) {
		System.out.println(collEx);
	}

	public static void main(String[] args) {

		CollectionsExample collEx = new CollectionsExample();
		collEx.add(false);
		collEx.add(10);
		collEx.add(100);
		collEx.add(1000);
		collEx.add(1000000L);
		collEx.add(10.5F);
		collEx.add(10.103E35D);
		collEx.add('A');
		collEx.add("Hello");
		collEx.add(new CollectionsExample());
	}

}
