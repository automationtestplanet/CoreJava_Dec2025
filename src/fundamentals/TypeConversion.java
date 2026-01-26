package fundamentals;

public class TypeConversion {

	
	public static int division(int a, int b) { 
		return a / b;
	}
	
	public static byte division2(int a, int b) { // do not convert the value at method level
		return (byte)(a / b);
	}
	
	public static void main(String[] args) {

		byte b1 = 100;

		short s1 = b1;  // no error due to higher memory  // it checks memory size   // Implicit Conversion
		System.out.println(s1);

		int i1 = b1;   // Implicit Conversion

		long l1 = b1;  // Implicit Conversion

		float f1 = b1;  // Implicit Conversion

		double d1 = b1;  // Implicit Conversion
		
		
		short s2 = 100;
		
		byte b2 = (byte)s2;   // error due to smaller memory    // Explicit Conversion
		
		System.out.println(b2);
		
		int i2 = s2;  // Implicit Conversion
		
//		byte b3 = 128;   // we can store upto 127
		
		short s3 = 128;
		byte b3  = (byte)s3;   // Explicit Conversion  // -128 to  +127  // -128
		System.out.println(b3);
		
		short s4 = 129;
		byte b4  = (byte)s4;   // Explicit Conversion  // -128 to  +127  // -127
		System.out.println(b4);
		
		short s5 = 300;
		byte b5 = (byte) s5;   // Explicit Conversion
		
		System.out.println(b5);
		
		
		
		int i3 = 500;   // 4 bytes		
		System.out.println(i3);
		
		float f3 = i3;  // 4 bytes  // Implicit Conversion
		System.out.println(f3);
		
		
		float f4 = 500.05f;  // 4 bytes
		System.out.println(f4);
		
		int i4 = (int)f4;   // 4 bytes  // Explicit Conversion 
		System.out.println(i4);
		
		float f5 = 1.5f;  // billion
		int i5 = (int) f5;
		
		System.out.println(i5);
		
		
		
		int result = division(1000,300);   // 3 // 4 bytes
		byte result2 = (byte)division(1000,300);    // 3
		System.out.println(result2);
		
		int result3 = division(1000,3);
		
		System.out.println(result3);
		
		
		
		
		String str1 = "100";		
		System.out.println(str1);
		
//		byte byte1 = (byte)str1;   // Explicit Conversion     // Error in Non-Primitive Datatype to Primitive Datatype Conversion
//		short short1 = (short)str1;   // Explicit Conversion  // Error in Non-Primitive Datatype to Primitive Datatype Conversion
//		int int1 = (int)str1;   // Explicit Conversion  	  // Error in Non-Primitive Datatype to Primitive Datatype Conversion
//		long long1 = (long)str1;   // Explicit Conversion	  // Error in Non-Primitive Datatype to Primitive Datatype Conversion
//		float float1 = (float)str1;   // Explicit Conversion	// Error in Non-Primitive Datatype to Primitive Datatype Conversion
//		double double1 = (double)str1;   // Explicit Conversion	// Error in Non-Primitive Datatype to Primitive Datatype Conversion
		
		
		byte byte2 = 100;
		short short2 = 200;
		int int2 = 300;
		long long2 = 400L;
		float float2 = 100.5F;
		double double2 = 100.534E32D;
		
//		String str2 = (String)byte2;    // Error in Primitive Datatype to Non-Primitive Datatype Conversion
//		String str3 = (String)short2;  // Error in Primitive Datatype to Non-Primitive Datatype Conversion
//		String str4 = (String)int2;		// Error in Primitive Datatype to Non-Primitive Datatype Conversion
//		String str5 = (String)long2;	// Error in Primitive Datatype to Non-Primitive Datatype Conversion
//		String str6 = (String)float2;	// Error in Primitive Datatype to Non-Primitive Datatype Conversion
//		String str7 = (String)double2;	// Error in Primitive Datatype to Non-Primitive Datatype Conversion
		
		

	}

}
