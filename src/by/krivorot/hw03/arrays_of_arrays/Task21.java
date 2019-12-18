package by.krivorot.hw03.arrays_of_arrays;

public class Task21 {
	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 *    n 0 0 ...   0 0 
	 *  n-1 n 0 ...   0 0	 
	 *    . . . ... . . .
	 *    3 4 5 ...   0 0
	 *    2 3 4 ...   n 0
	 *    1 2 3 ... n-1 n  
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
		int tmp;

		for (i = 0; i < mas.length; i++) {
			tmp = i;
			for (j = 0; j < mas[i].length; j++) {
				if (j <= i) {
					mas[i][j] = mas[i].length - tmp;
					tmp--;
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
