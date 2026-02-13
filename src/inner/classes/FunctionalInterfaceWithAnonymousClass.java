package inner.classes;


@FunctionalInterface
public interface FunctionalInterfaceWithAnonymousClass {	
	public void addition(int a, int b);
	
	public static void main(String[] args) {
		FunctionalInterfaceWithAnonymousClass funInf = new FunctionalInterfaceWithAnonymousClass() {
			@Override
			public void addition(int a, int b) {
				System.out.println("Addition: "+ (a+b));				
			}			
		};
		
		funInf.addition(100, 200);
	}
}
