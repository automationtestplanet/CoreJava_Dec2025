package fundamentals;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "Hello";
		System.out.println(str1);
		
//		String upperCaseStr = str1.toUpperCase();
//		System.out.println(upperCaseStr);
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		
//		str1 = str1.toUpperCase();
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.length());
		
		System.out.println(str1.concat(" World"));
		System.out.println(str1);
		
//		str1 = str1.concat(" World");		
//		System.out.println(str1);
		
		System.out.println(str1.indexOf('H'));  // index always starts with 0
		System.out.println(str1.indexOf('l'));  // index always starts with 0
		System.out.println(str1.lastIndexOf('l'));  // index always starts with 0
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(4));
		
		char[] charArr = str1.toCharArray();
		
		for(char eachChar : charArr) {
			System.out.println(eachChar);
		}
		
		String str2 = new String(charArr);
		
		System.out.println(str2);
		
		System.out.println(str1.contains("He"));
		System.out.println(str1.contains("eH"));
		
		System.out.println(str1.equals("Hello"));
		System.out.println(str1.equals("hello"));
		System.out.println(str1.equalsIgnoreCase("hello"));
		
		String str3 = "Java"; // It will store in String Constant Pool
		String str4 = "Java"; // It will store in String Constant Pool
		
		String str5 = new String("Java");   // It will store in a Heap memory
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println(str3==str5);   // Binary Comparison
		System.out.println(str3.equals(str5));  // String Comparison
		
		String str6 = "Hello Java World";
		
		String[] strArr = str6.split(" ");  //Delimiter is " "
		for(String eachStr  : strArr) {
			System.out.println(eachStr);
		}
		
		String str7 = "World";
		
		for(int index = 0; index<str7.length(); index++) {
			System.out.println(str7.charAt(index));
		}
		
		for(int index = str7.length()-1; index>= 0; index--) {
			System.out.println(str7.charAt(index));
		}
		
		String str8 = "Hello World";
		System.out.println(str8.substring(6, 11));
		System.out.println(str8.substring(6));
		System.out.println(str8.substring(3));
		
		System.out.println(str8.replace('l', 'L'));
		System.out.println(str8.replaceFirst("l", "L"));
		System.out.println(str8.replaceAll("l", "L"));
		
		String str9 = "Hello@#7338World@^#*9279684";
		
		System.out.println(str9.replaceAll("[^a-z]", ""));
		System.out.println(str9.replaceAll("[^A-Z]", ""));
		System.out.println(str9.replaceAll("[^a-zA-Z]", ""));
		System.out.println(str9.replaceAll("[^0-9]", ""));
		System.out.println(str9.replaceAll("[a-zA-Z0-9]", ""));
		
		
		

	}

}
