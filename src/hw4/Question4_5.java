package hw4;

import java.util.Scanner;

public class Question4_5 {
	public static void main(String[] args) {
		
		//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
		//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		//	(提示1:Scanner,陣列) (提示2:需將閏年條件加入)(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] months= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int days=0;
		
		System.out.print("請輸入年份: ");
		int yy = sc.nextInt();
		while(yy<1) {
			System.out.println("輸入錯誤");
			 yy = sc.nextInt();
		}
		
		System.out.print("請輸入月份: ");
		int mm = sc.nextInt();
		while(mm<1 || mm>12) {
			System.out.println("輸入錯誤");
			 mm = sc.nextInt();
		}
		
		System.out.print("請輸入日: ");
		int dd = sc.nextInt();
		while(dd<1 || dd>months[mm-1]) {
			System.out.println("輸入錯誤");
			 dd = sc.nextInt();
		}	
		
		if( (yy%4==0 && yy%100!=0) || (yy%400==0 && yy%100==0)) {
			System.out.println("這年是閏年");
			months[1]++;
		}else {
			System.out.println("這年是平年");
		}			
			
		days+=dd;
		
		for(int i=0; i<mm-1; i++) {
			days += months[i];
		}
		
		System.out.println("輸入的日期為該年第" + days + "天");

	}
}
