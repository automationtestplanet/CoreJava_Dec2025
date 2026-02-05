package oop.abstraction;

abstract public class AbstractClassWithConstructor {

	String name;
	String location;

	public AbstractClassWithConstructor(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	abstract public void addition(int a, int b);

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Location: " + location);
	}

	public static void main(String[] args) {
//		AbstractClassWithConstructor absCls  = new AbstractClassWithConstructor("Raju", "Hyderabad");

	}

}
