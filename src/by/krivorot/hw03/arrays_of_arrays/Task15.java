package by.krivorot.hw03.arrays_of_arrays;

public class Task15 {
	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 *  n   0   0 ... 0
	 *  0 n-1   0 ... 0
	 *  0   0 n-2 ... 0 
	 *  .   .   . ... . 
	 *  .   .   . ... . 
	 *  .   .   . ... . 
	 *  0   0   0 ... 1 
	 */

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		init(mas, 20);
		printMas(mas);
	}
	
	public static void init(int[][] mas, int limit) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = mas.length - i;
				} else {
					mas[i][j] = 0;
				}
			}
		}
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}

}
