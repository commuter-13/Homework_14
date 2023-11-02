package hw3;

public class Homework_3 {
	public static void main(String[] args) {
		// 1. create three 3x3 array
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		// 2. put random data to x array
		for(int i=0 ; i<x.length ; i++) {
			for(int j=0 ; j<x[i].length ; j++) {
				x[i][j]=(int)(Math.random()*31);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===================");
		
		// 3. put random data to y array
		for(int i=0 ; i<y.length ; i++) {
			for(int j=0 ; j<y[i].length ; j++) {
				y[i][j]=(int)(Math.random()*31);
				System.out.print(y[i][j]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println("===================");
		
		// 4. add x and y and put to z array
		for(int i=0 ; i<z.length ; i++) {
			for(int j=0 ; j<z[i].length ; j++) {
				z[i][j]=x[i][j]+y[i][j];
				System.out.print(z[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}
}
