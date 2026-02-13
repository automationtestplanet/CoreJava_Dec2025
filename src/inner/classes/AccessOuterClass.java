package inner.classes;

import inner.classes.OuterClass.InstanceInnerClass;
import inner.classes.OuterClass.StaticInnerClass;

public class AccessOuterClass {

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
