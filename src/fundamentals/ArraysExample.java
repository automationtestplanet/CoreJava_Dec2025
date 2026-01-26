package fundamentals;

public class ArraysExample {
	
	int a = 100;
	int b = 200;
	String str = "Hello";

	public static void main(String[] args) {
		System.out.println("-------------------1Dimension Array------------------------");
			byte[] byteArr1 = {10,20,30};
			
			System.out.println(byteArr1);
			System.out.println(byteArr1[0]);
			
//			ArraysExample arrEx = new ArraysExample();
//			System.out.println(arrEx);
			
			int intArr[] = {100,200,300,500};
			System.out.println(intArr[0]);
			System.out.println(intArr[1]);
			System.out.println(intArr[2]);
			System.out.println("-------------------------------------------");
			int arrLen = intArr.length;
			System.out.println(arrLen);
			
			System.out.println("-------------------------------------------");
			for(int i=0; i<intArr.length; i++) {
				System.out.println(intArr[i]);
			}
			System.out.println("-------------------------------------------");
			
			for(int eachIntVal: intArr) {   // Enhanced for loop for Arrays and Collections
				System.out.println(eachIntVal);
			}
			
			System.out.println("-------------------------------------------");			
			intArr[2] = 400;
			System.out.println(intArr[2]);
			
			System.out.println("-------------------------------------------");
			int[] intArr2 = new int[4];
			intArr2[0] = 1000;
			intArr2[1] = 2000;
			intArr2[2] = 3000;
			
			for(int eachIntVal : intArr2) {
				System.out.println(eachIntVal);
			}
			
			System.out.println("--------------2Dimension Array-----------------------");
			int[] intArr3 = {10,20,30};
			int[] intArr4 = {100,200,300};
			int[] intArr5 = {1000,2000,3000};
			
			int[][] int2DArr = {intArr3,intArr4,intArr5};
			
			int[][] int2DArr2 = {{10,20,30},{100,200,300},{1000,2000,3000}};
			
			for(int i=0; i<int2DArr2.length; i++) {
				for(int j=0; j<int2DArr2[i].length;j++) {
					System.out.print(int2DArr2[i][j]+ " "); 
				}				
				System.out.println("");
			}
			
			System.out.println("-------------------------------------");
			
			for(int[] eachIntArr : int2DArr2) {
				for(int eachIntVal : eachIntArr) {
					System.out.print(eachIntVal+ " ");
				}
				System.out.println("");
			}
	}

}
