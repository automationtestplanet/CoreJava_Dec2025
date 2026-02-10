package oop.abstraction;

public class ExtendAbstractClassWithConstrucotr extends AbstractClassWithConstructor{

	public ExtendAbstractClassWithConstrucotr(String name, String location) {
		super(name, location);		
	}
	

	@Override
	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}
	
	
	public static void main(String[] args) {
		AbstractClassWithConstructor absCls = new ExtendAbstractClassWithConstrucotr("Raju","Hyderabad");
		absCls.displayDetails();
	}

}
