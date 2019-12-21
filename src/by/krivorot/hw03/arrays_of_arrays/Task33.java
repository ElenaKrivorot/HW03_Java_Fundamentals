package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task33 {
	/* Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. */

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		init(mas, 100);
		printMas(mas);

		sortColumnsInMasAscending(mas);
		printMas(mas);
		sortColumnsInMasDescending(mas);
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

	public static void sortColumnsInMasAscending(int[][] mas) {
		int j;

		for (j = 0; j < mas[0].length; j++) {
			sortColumnAscending(mas, j);
		}
	}

	public static void sortColumnsInMasDescending(int[][] mas) {
		int j;

		for (j = 0; j < mas[0].length; j++) {
			sortColumnDescending(mas, j);
		}
	}

	public static void sortColumnAscending(int[][] mas, int k) {
		int i;
		int j;
		int tmp;

		for (i = mas.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {

				if (mas[j][k] > mas[j + 1][k]) {
					tmp = mas[j][k];
					mas[j][k] = mas[j + 1][k];
					mas[j + 1][k] = tmp;
				}
			}
		}
	}

	public static void sortColumnDescending(int[][] mas, int k) {
		int i;
		int j;
		int tmp;

		for (i = mas.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {

				if (mas[j][k] < mas[j + 1][k]) {
					tmp = mas[j][k];
					mas[j][k] = mas[j + 1][k];
					mas[j + 1][k] = tmp;
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
