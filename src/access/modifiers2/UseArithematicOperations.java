package access.modifiers2;

import access.modifiers.ArithematicOperations;
public class UseArithematicOperations {

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		arOp.addition(10, 20);				// public can be accessed out side of package
//		arOp.subtraction(100, 20);			// protected can not be accessed out side of package but we can access when inherited
//		arOp.multiplication(10, 20);		// default can not be accessed out side of package
//		arOp.division(10, 3);				// private can not be accessed out side of package and class
	}

}
