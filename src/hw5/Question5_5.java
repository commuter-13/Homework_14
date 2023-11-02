package hw5;

public class Question5_5 {

	// 請設計一個方法 genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合

	private String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private String code = "";

	public String genAuthCode() {
		for (int i = 0; i < 8; i++) {
			int r = (int) (Math.random() * s.length());
			code += s.charAt(r);
		}
		return code;
	}
	
	// ASCII 48-57數字、65-90英文大寫、97-122英文小寫


	public static void main(String[] args) {

		Question5_5 q1 = new Question5_5();

		System.out.println("本次隨機產生的驗證碼為：" + q1.genAuthCode());

	}

}
