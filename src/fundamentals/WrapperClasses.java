package fundamentals;

public class WrapperClasses {

	public static void main(String[] args) {
		
		String str = "100";   // Non-Primitive datatype
		
		byte byte1 = 100;   // Primitive datatype
		
		Byte b1 = 100;   // Non-Primitive Wrapper datatype
		
//		byte1 = str;  // Non-Primitive to Primitive not possible
//		str = byte1;  // Primitive to Non-Primitive not possible
		
		byte1 = b1; // Non-Primitive Wrapper to Primitive is possible
		b1 = byte1; // Primitive to Non-Primitive wrapper is possible
		
		byte1 = Byte.parseByte(str);   // Non-Primitive to Primitive using wrapper class
		System.out.println(byte1);
		
		
		
		int int1 = Integer.parseInt(str);  // Non-Primitive to Primitive using wrapper class
		float float1 = Float.parseFloat(str); // Non-Primitive to Primitive using wrapper class
		
		String str2 = "true";
		boolean bool1 = Boolean.parseBoolean(str2); // Non-Primitive to Primitive using wrapper class
		
		
		long long1 = 10000L;
		boolean bool2  = false;
		double double1 = 100.354E3D;
		
//		String str3 = long1; // Primitive to Non-Primitive not possible
		
		String str3 = String.valueOf(long1); // Primitive to String using String class
		String str4 = String.valueOf(bool2);  // Primitive to String using String class
		String str5 = String.valueOf(double1);  // Primitive to String using String class
		
		
		
		
		
		

	}

}
