package by.krivorot.hw03.arrays_of_arrays;

public class Task18 {
	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 * 1 ... 1 1 1
	 * 2 ... 2 2 0
	 * 3 ... 3 0 0
	 * . ... . . .
	 * n ... 0 0 0
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
				if (j >= mas.length - i) {
					mas[i][j] = 0;
				} else {
					mas[i][j] = i + 1;
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
