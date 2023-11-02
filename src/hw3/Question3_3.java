package hw3;

import java.util.Scanner;

public class Question3_3 {
	public static void main(String[] args) {
		
		// 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
		
		System.out.println("請輸入討厭的數字:");
		
		Scanner sc = new Scanner(System.in);
		int hate = sc.nextInt();
		int num =0; 
		
		for(int i=1; i<=49; i++){
			if(i%10!=hate && i/10!=hate) {
				System.out.print(i +" ");
				num+=1;
			}
		}
			
		System.out.println();
		System.out.println("總共"+num+"個數字");
		
		//進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複
		
		
	}

}
