package hw3;

import java.util.Scanner;

public class Question3_1 {
	public static void main(String arg[]) {
		
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in);
	
		System.out.println("請輸入三個數字:");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
	    int z = sc.nextInt();
	  
		System.out.println();
		
		if(x+y>z && y+z>x && x+z>y) {
			if(x==y && y==z && x==z ) {
				System.out.print("正三角形");
			}else if(x==y || y==z || x==z) {
				System.out.print("等腰三角形");
			}else {
				System.out.print("其他三角形");
			}
		}else
			System.out.print("不是三角形");
		
}
}
