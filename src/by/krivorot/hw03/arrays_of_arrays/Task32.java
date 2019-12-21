package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task32 {
	/* Отсортировать строки матрицы по возрастанию и убыванию значений элементов. */

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		init(mas, 100);
		printMas(mas);

		sortLinesInMasAscending(mas);
		printMas(mas);
		sortLinesInMasDescending(mas);
		printMas(mas);
	}

	public static void init(int[][] mas, int limit) {
		int i;
		int j;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(limit);
			}
		}
	}

	public static void sortLinesInMasAscending(int[][] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			sortLineAscending(mas[i]);
		}
	}

	public static void sortLinesInMasDescending(int[][] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			sortLineDescending(mas[i]);
		}
	}

	public static void sortLineAscending(int[] mas) {
		int i;
		int j;
		int tmp;

		for (i = mas.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {

				if (mas[j] > mas[j + 1]) {
					tmp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = tmp;
				}
			}
		}
	}

	public static void sortLineDescending(int[] mas) {
		int i;
		int j;
		int tmp;

		for (i = mas.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {

				if (mas[j] < mas[j + 1]) {
					tmp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = tmp;
				}
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
		System.out.println();
	}
}
