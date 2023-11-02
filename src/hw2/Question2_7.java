package hw2;

public class Question2_7 {
	public static void main(String[] args) {
		
		//請設計一隻Java程式,輸出結果為以下:
				
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF

		for (int i=1; i<=6; i++) {
			for (int j=1; j<=i; j++) {
				switch(i) {
						case 1:				
					System.out.print("A");
					break;
						case 2:
					System.out.print("B");
					break;
						case 3:
					System.out.print("C");
					break;
						case 4: 
					System.out.print("D");
					break;
						case 5:
					System.out.print("E");
					break;	
						case 6:
					System.out.print("F");
					break;	
				}
			}
			System.out.println();
		}
	}

}
