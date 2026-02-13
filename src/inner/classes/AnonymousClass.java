package inner.classes;

public class AnonymousClass {
	
	public void method1() {
		System.out.println("This is Method1");
	}

	public static void main(String[] args) {

		AnonymousClass anoCls = new AnonymousClass() {
			
			@Override
			public void method1() {
				System.out.println("This is Anonymous Class Method1");
			}
			
			public void method2() {
				System.out.println("This is Anonymous Class Method2");
			}
			
			public void method3() {
				System.out.println("This is Anonymous Class Method3");
			}
		};
		
		anoCls.method1();
//		anoCls.method2();
//		anoCls.method3();

	}

}
