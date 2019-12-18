package by.krivorot.hw03.arrays_of_arrays;

public class Task25 {
	/*
	 * Получить квадратную матрицу порядка n: 
	 *           1         2 ...   n-1   n 
	 *         n+1       n+2 ...  2n-1  2n 
	 *        2n+1      2n+2 ...  3n-1  3n
	 *           .         . ...     .   . 
	 *    (n-1)n+1  (n-1)n+2 ... n^2-1 n^2
	 */

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		init(mas);
		printMas(mas);
	}

	public static void init(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = mas.length * i + (j + 1);
			}
		}

	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
