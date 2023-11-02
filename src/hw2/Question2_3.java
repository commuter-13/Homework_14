package hw2;

public class Question2_3 {
	public static void main(String[] args) {

		//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		
		int i=1;
		int num=1;
		
		while(i<=10) {
			num *= i;
			i++;
		}
		System.out.println("1~10 的連乘積 " + num);
		
	}
}
