package hw1;

public class hw2 {
	public static void main(String[] args) {
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int num1=0;
		
		for(int i=1;i<=1000;i++) {
			if(i%2==0) {
				num1+=i;
			}
		}
		System.out.println("1~1000的偶數和 "+num1);
		
		System.out.println("=");
		
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int num2=1;
		
		for(int i=1;i<=10;i++) {
				num2*=i;
		}
		System.out.println("1~10的連乘積 "+num2);
		
		System.out.println("=");
		
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int x=1;
		int num3=1;
		
		while(x<=10) {
			num3*=x;
			x++;
		}
		System.out.println("1~10的連乘積 "+num3);
		
		System.out.println("=");
		
//請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		for(int i=1;i<=10;i++) {
			System.out.print(i*i+" ");
		}
		System.out.println();
		
		System.out.println("=");
		
//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int k=0;
		for(int i=1;i<=49;i++) {
			if(i%10!=4 && i/10!=4) {
				System.out.print(i+" ");
				k+=1;
			}
		}
		System.out.println("\n總共有"+k+"個數字");
		
		System.out.println("=");
		
//請設計一隻Java程式,輸出結果為以下:
		
//  1 2 3 4 5 6 7 8 9 10
//  1 2 3 4 5 6 7 8 9
//  1 2 3 4 5 6 7 8
//  1 2 3 4 5 6 7
//  1 2 3 4 5 6
//  1 2 3 4 5
//  1 2 3 4
//  1 2 3
//  1 2
//  1
                          
		for(int i=10;i>=1;i--) {	
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("=");
		
//請設計一隻Java程式,輸出結果為以下:
		
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF

		for (int a=1; a<=6; a++) {
			for (int b=1; b<=a; b++) {
				switch(a) {
						case 1:				
					System.out.print("A ");
					break;
						case 2:
					System.out.print("B ");
					break;
						case 3:
					System.out.print("C ");
					break;
						case 4: 
					System.out.print("D ");
					break;
						case 5:
					System.out.print("E ");
					break;
						case 6:
					System.out.print("F ");
					break;	
				}
			}
			System.out.println();
		}
	}
}

