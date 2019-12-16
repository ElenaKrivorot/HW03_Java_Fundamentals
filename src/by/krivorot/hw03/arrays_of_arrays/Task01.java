package by.krivorot.hw03.arrays_of_arrays;

public class Task01 {
	/*
	 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
	 * была ровно одна единица, и вывести на экран.
	 */

	public static void main(String[] args) {
		int[][] mas = new int[3][4];

		init(mas);
		printMas(mas);

	}

	public static void init(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = 1;
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
