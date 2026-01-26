package access.modifiers;

public class UseArithematicOperations {

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		arOp.addition(10, 20);				// public accessed
		arOp.subtraction(100, 20);			// protected accessed
		arOp.multiplication(10, 20);		// default accessed
//		arOp.division(10, 3);				// private can not be accessed out side of class
	}

}
