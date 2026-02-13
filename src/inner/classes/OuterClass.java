package inner.classes;

import inner.classes.OuterClass.InstanceInnerClass;

public class OuterClass {

	public void method1() {
		System.out.println("This is OuterClass Instance Method1 is Executed");
	}

	public static void method2() {
		System.out.println("This is OuterClass Static Method2 is Executed");
	}

	static class StaticInnerClass { // Static Inner Class with Name
		public void method3() {
			System.out.println("This is StaticInnerClass Instance Method3 is Executed");
		}

		public static void method4() {
			System.out.println("This is StaticInnerClass Static Method4 is Executed");
		}
	}

	class InstanceInnerClass { // Instance Inner Class with Name
		public void method5() {
			System.out.println("This is InstanceInnerClass instance Method5 is Executed");
		}

		public static void method6() {
			System.out.println("This is InstanceInnerClass static Method6 is Executed");
		}
	}

	static { // Static Inner Class without Name -> Static block
		// we cannot write any methods
		int a = 100;
		int b = 200;
//		System.out.println(a + b);
		System.out.println("This is Static block is Executed");
	}

	{ // Instance Inner Class without Name -> Anonymous Class
		int a = 300;
		int b = 400;
//		System.out.println(a + b);
		System.out.println("This is Anonymous Class is Executed");

		// We can write the method in Anonymous class but we need to provide the
		// reference of another class.
	}

	public static void main(String[] args) {

		OuterClass.method2();

		OuterClass outerCls = new OuterClass();

		OuterClass.StaticInnerClass.method4();

		OuterClass.StaticInnerClass staticInnerCls = new StaticInnerClass();
		staticInnerCls.method3();

		OuterClass.InstanceInnerClass innerInsCls = outerCls.new InstanceInnerClass();
		innerInsCls.method5();
		InstanceInnerClass.method6();

	}
}
