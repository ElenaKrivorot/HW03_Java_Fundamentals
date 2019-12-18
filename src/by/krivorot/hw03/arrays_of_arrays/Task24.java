package by.krivorot.hw03.arrays_of_arrays;

public class Task24 {
	/*
	 * Дан линейный массив x1, x2, ..., xn . Получить действительную квадратную
	 * матрицу порядка n:
	 *   x1,   x2, ...,   xn
	 * x1^2, x2^2, ..., xn^2
	 *    .     .  ...     .
	 * x1^n, x2^n, ..., xn^n   
	 */

	public static void main(String[] args) {
		int[] mas1 = new int[] { 1, 2, 3, 4, 5 };
		int[][] mas2 = new int[mas1.length][mas1.length];

		init(mas1, mas2);
		printMas(mas2);
	}

	public static void init(int[] mas1, int[][] mas2) {
		int i;
		int j;

		for (i = 0; i < mas2.length; i++) {
			for (j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) Math.pow(mas1[j], i + 1);
			}
		}

	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%7d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
