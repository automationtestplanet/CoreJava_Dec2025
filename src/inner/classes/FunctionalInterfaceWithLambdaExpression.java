package inner.classes;

@FunctionalInterface
public interface FunctionalInterfaceWithLambdaExpression {
	public void addition(int a, int b);

	public static void main(String[] args) {
		FunctionalInterfaceWithAnonymousClass funInf = (a, b) -> {
			System.out.println("Addition with Lambda Expression : " + (a + b));
		};

		funInf.addition(100, 200);

		FunctionalInterfaceWithAnonymousClass funInf2 = (a, b) -> System.out
				.println("Addition with Lambda Expression : " + (a + b));
		
		funInf2.addition(1000, 2000);

	}
}
