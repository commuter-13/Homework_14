package hw5;

public class Question5_3 {

	// 利用 Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),可以找出二維陣列的最大值並回傳

	int maxElement(int x[][]) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	double maxElement(double x[][]) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Question5_3 q = new Question5_3();

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		System.out.println(q.maxElement(intArray));
		System.out.println(q.maxElement(doubleArray));

	}

}
