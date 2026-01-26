package fundamentals;

public class KeywordsDatatypesVariables {

//	boolean boolean3 = true;
//	
//	System.out.println(boolean3);

	public static void main(String[] args) {

		boolean boolean1 = true;
		boolean boolean2 = false;

		System.out.println(boolean1);
		System.out.println(boolean2);

		byte byte0 = -128;
		byte byte1 = 127;
//		byte byte2 = 128;

		short short0 = -32768;
		short short1 = 32767;
//		short short2 = 32768;

		char char1 = 'A';
		char char2 = 'a';
		char char3 = '#';
		char char4 = '1';
//		char char5 = A;
//		char char6 = 'Aa';

		int int1 = 32768;
		long long1 = 3234567889L;
		long long2 = 3234567889l;

		float float1 = 100.05F;
		float float2 = 100.05f;

		double double1 = 100.235E23D;
		double double2 = 100.235E23d;

		String string1 = "Hello";
		String string2 = "Hello123";
		String string3 = "Hello@123";

		String paragraph = "Unlike Web applications, RESTful APIs are usually stateless, which means sessions or cookies should not be used. Therefore, each request should come with some sort of authentication credentials. A common practice is to send a secret access token with each request to authenticate the user. Since an access token can be used to uniquely identify and authenticate a user, API requests should always be sent via HTTPS to prevent man-in-the-middle (MitM) attacks.";

	}

}
