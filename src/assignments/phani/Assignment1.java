package assignments.phani;

public class Assignment1 {
	
	// Write a reusable Java Program to print the Armstrong numbers between given range
		// Ex: 100  to 1000 -> 153, 370, 371, 407
		 


		public static void main(String[] args) {
			System.out.println("armstrong numbers between 100 and 1000");
		
		for (int i =100;i<1000;i++)
		{
			int r , sum=0;
			 int temp=i;
			while(temp>0)
			{
			r=temp % 10;
			sum = sum + (r*r*r);
			temp=temp/10;
			}
			if(i==sum)
				System.out.println(i);
		}
		
		

			    }

	

}
