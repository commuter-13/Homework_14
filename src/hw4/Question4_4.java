package hw4;

import java.util.Scanner;

public class Question4_4 {
	public static void main(String[] args) {
		
		// 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
		// 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數
		// 例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入金額:");
		int borrow = sc.nextInt();
		
		int arr[][]= {
				{25,2500},
				{32,800},
				{8,500},
				{19,1000},
				{27,1200} };
			
		int total=0;
		
		System.out.print("有錢可借的員工編號:");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<2; j++) {
				if(borrow<=arr[i][j]) {
					total += 1;
					System.out.print(arr[i][0]+" ");
				}
			}
		}
		
		if(total==0) {
			System.out.println("沒有人可以借");
		}else
			System.out.print("，共"+ total + "人!");
	}
}
