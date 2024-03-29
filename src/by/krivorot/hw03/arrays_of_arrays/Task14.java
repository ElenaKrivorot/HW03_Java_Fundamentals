package by.krivorot.hw03.arrays_of_arrays;

public class Task14 {
	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 * 0 ... 0 0 1
	 * 0 ... 0 2 0
	 * 0 ... 3 0 0
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
				if (j == mas.length - 1 - i) {
					mas[i][j] = i + 1;
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
