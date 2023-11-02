package hw4;

public class Question4_6 {

	public static void main(String[] args) {

		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// 陣列：8位同學，最高分的次數
		int[] count = new int[8];

		for (int i = 0; i < scores.length; i++) {
			int scoreMax = 0;
			int studentMax = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if (scoreMax < scores[i][j]) {
					scoreMax = scores[i][j];
					studentMax = j;
				}
			}
			count[studentMax]++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println("學生" + (i + 1) + "號考" + count[i] + "次最高分");
		}

	}

}
