package hw4;

public class Question4_3 {
	public static void main(String[] args) {
		
		// 有個字串陣列如下 (八大行星)：{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		// (提示:字元比對,String方法)
				
		String[] arr = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		int total=0;
		
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			System.out.print(str + " ");
			for(int j=0; j<str.length(); j++) {
				char alphabet = str.charAt(j);
				if(alphabet == 'a' || alphabet == 'e'|| alphabet == 'i'|| alphabet == 'o'|| alphabet == 'u') {
					total += 1;
				}	
			}
		}
		
		System.out.println("\n母音有:" + total + "個");
		
	}

}
