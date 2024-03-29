package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task29 {
	/*
	 * Найти положительные элементы главной диагонали квадратной матрицы.
	 */

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		init(mas, 200);
		printMas(mas);
		printPositiveElements(findPositiveElementsInMainDiagonal(mas));
	}

	public static void init(int[][] mas, int limit) {
		int i;
		int j;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(limit) - 100;
			}
		}
	}

	public static int[] findPositiveElementsInMainDiagonal(int[][] mas) {
		int i;
		int j;
		int k = 0;
		int[] positive = new int[mas.length];

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (i == j && mas[i][j] > 0) {
					positive[k] = mas[i][j];
					k++;
				}
			}
		}
		return positive;
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void printPositiveElements(int[] mas) {
		int i = 0;

		System.out.println("Положительные элементы на главной диагонали:");
		while (mas[i] > 0) {
			System.out.printf("%5d", mas[i]);
			i++;
		}
		System.out.println();
	}
}
