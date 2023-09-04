package hw1;

public class hw1 {
	public static void main(String[] args) {
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println("第一題");
		
		int a = 12;
		int b = 6;
		
		int num1=a+b;
		int num2=a*b;
		
		System.out.println("12,6這兩個數值的和=" + num1);
		System.out.println("12,6這兩個數值的積=" + num2);
		
		//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		System.out.println("第二題");
		
		int eggs=200;
		
		int dozons=eggs/12;
		int egg=eggs%12;
		
		System.out.println("200顆蛋共是:" + dozons +"打"+ egg +"顆");
		
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("第三題");
		
		int seconds=256559;
		
		int d = seconds/60/60/24;
		int h = seconds/60/60%60;
		int m = seconds/60%60;
		int s = seconds%60;
		
		System.out.println("256559秒為:"+ d +"天"+ h +"小時"+ m +"分"+ s +"秒");
		
		//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		System.out.println("第四題");
		
		final double PI=3.1415;
		int r=5;
		
		System.out.println ("圓面積="+(r*r*PI));
		System.out.println ("圓周長="+(r*2*PI));
	    	  
		//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		//本利和 = 本金 × (1 + 年利率)
		System.out.println("第五題");
	
		int money= 1_500_000;
		double rate=0.02;
		double saving = money*(1+rate); //第一年
		
		for(int y=2;y<=10;y++) {
			saving=saving*(1+rate);
		}
		
		System.out.println ("計算10年後,本金加利息共有"+(int)saving+"元");

		//請寫一隻程式,利用System.out.println()印出以下三個運算式結果，並請用註解各別說明答案的產生原因
		System.out.println("第六題");
		
		System.out.println(5+5);
		//型別int 5 + 型別int 5，得到 int 10
		
		System.out.println(5+'5');
		//型別int 5 + 型別char 5，依Unicode編碼char5代表十六進位值為0x35，換算十進位數值為型別int數值53，所得十進位之和int數值58
		
		System.out.println(5+"5");
		//型別int 5 + 型別String 5，字串接相連，得到 String 55
	}
	

	
	
	
}