package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ObjectClass {

	public void add(Object obj1) {
		System.out.println(obj1);
	}

	public static void main(String[] args) {
		Object obj1 = false;
		Object obj2 = 10;
		Object obj3 = 100;
		Object obj4 = 1000;
		Object obj5 = 1000000L;
		Object obj6 = 10.5F;
		Object obj7 = 10.103E35D;
		Object obj8 = 'A';
		Object obj9 = "Hello";
		Object obj10 = new CollectionsExample(); // by default all the classes extends Object class
		Object obj11 = new ArrayList();
		Object obj12 = new HashSet();
		Object obj13 = new HashMap();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);

		boolean bool1 = (boolean) obj1;
		int byte1 = (int) obj2;
		int short1 = (int) obj3;
		int int1 = (int) obj4;

		System.out.println((int) obj3 + 200);

		ObjectClass objCls = new ObjectClass();
		objCls.add(false);
		objCls.add(10);
		objCls.add(100);
		objCls.add(1000);
		objCls.add(1000000L);
		objCls.add(10.5F);
		objCls.add(10.103E35D);
		objCls.add('A');
		objCls.add("Hello");
		objCls.add(new CollectionsExample());
		
		String str1 = (String)obj9;
		
		System.out.println(str1);
		
//		int int2 = (int)obj9;
//		System.out.println(int2);
//		long long2 = (long)obj9;
//		char char2 = (char)obj9;
//		double double2 = (double)obj9;
//		List list1 = (List)obj9;
		
		
		var var1 = false;
		var var2 = 10;
		var var3 = 100;
		var var4 = 1000;
		var var5 = 1000000L;
		var var6 = 10.5F;
		var var7 = 10.103E35D;
		var var8 = 'A';
		var var9 = "Hello";
		var var10 = new CollectionsExample(); // by default all the classes extends Object class
		var var11 = new ArrayList();
		var var12 = new HashSet();
		var var13 = new HashMap();
		
		System.out.println(var3 + 500);
	}

}
