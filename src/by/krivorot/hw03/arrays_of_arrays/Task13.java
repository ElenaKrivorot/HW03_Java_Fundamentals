package by.krivorot.hw03.arrays_of_arrays;

public class Task13 {
	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 * 1   2   3 ... n
	 * n n-1 n-2 ... 1
	 * 1   2   3 ... n
	 * n n-1 n-2 ... 1
	 * ...............
	 * n n-1 n-2 ... 1
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
			if (i == 0 || i % 2 == 0) {
				for (j = 0; j < mas[i].length; j++) {
					mas[i][j] = j + 1;
				}
			} else {
				for (j = 0; j < mas[i].length; j++) {
					mas[i][j] = mas[i].length - j;
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
