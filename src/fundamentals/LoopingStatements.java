package fundamentals;

public class LoopingStatements {

	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			System.out.println("Hello");
////			 i++;
//		}
		
		for(int i=1; i<=10; i++) {
			System.out.println("190 X "+ i + " = "+ (190*i));
//			 i++;
		}
		
		int x = 10;
		while(x<10) {
			System.out.println("Hello");
			x++;
		}
		
		int p = 10;
		do {
			System.out.println("Hello");
			p++;
		}while(p<15);
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*"+ " ");
			}
			
			System.out.println();
		}

	}

}
