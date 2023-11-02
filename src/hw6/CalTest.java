package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("請輸入x的值：");
				int x = sc.nextInt();
				
				System.out.println("請輸入y的值：");
				int y = sc.nextInt();
				
				c1.powerXY(x, y);
				
			}catch(CalException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}