package hw3;

import java.util.Scanner;

public class Question3_2 {
	public static void main(String[] args) {
	
		// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
		
		System.out.println("開始猜數字吧 0~9 !");

		int ans1 = (int)(Math.random()*10);
		
		System.out.println(ans1);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			if(ans1 == x) {
				System.out.println("答對了,答案就是" + ans1);
				break;
			}else{
				System.out.println("答錯了");
			}
		}
		
		//進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
		
		System.out.println("開始猜數字 0~100 !");
		
		int ans2 = (int)(Math.random()*100);
		System.out.println(ans2);
		
		while(true) {
			int x = sc.nextInt();
			if(x < ans2) {
				System.out.println(x + "小於正確答案");
			}else if(x > ans2){
				System.out.println(x + "大於正確答案");
			}else{
				System.out.println("答對了");
			}
		}
		
	}
}
