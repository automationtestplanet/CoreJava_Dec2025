package oop.abstraction;

public class MultipleInheritnceWithInterfaces implements Interface2,Interface3 {

	@Override
	public void multiplication(int a, int b) {
		System.out.println("Multipliation"+ (a*b));
		
	}

	@Override
	public void addition(int a, int b) {
		System.out.println("Addition"+ (a+b));
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println("Subtraction"+ (a-b));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
