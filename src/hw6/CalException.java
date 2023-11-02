package hw6;
// 請設計三個類別 Calculator.java, CalException.java 與 CalTest.java,
// 在 Calculator.java 裡,有個自訂方法為 powerXY(int x, int y),功能是會計算 x 的 y 次方,並回傳結果。
// CalTest.java 執行後,使用者可以輸入 x 與 y 的值,請加入例外處理機制,讓程式能解決以下狀況:
// 1. x 與 y 同時為 0，(產生自訂的 CalException 例外物件)
// 2. y 為負值，而導致 x 的 y 次方結果不為整數
// 3. x 與 y 皆正確情況下，會顯示運算後結果

public class CalException extends Exception {
	
	public CalException() {

	}

	public CalException(String message) {
		super(message);
	}

}
