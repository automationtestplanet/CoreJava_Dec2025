package assignments.saritha;

public class Assignment1 {
	
	// Write a reusable Java Program to sort an array
	// int[] intArr = {5,3,1,4,2}  -> {1,2,3,4,5}

	public static void main(String[] args) {
		 
		int arr[] = { 5,3,1,4,2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				int temp = 0;
				
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
	        }
			System.out.print(arr[i] + " ");

	}

}
