package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task10 {
	/* Дана матрица. Вывести k-ю строку и p-й столбец матрицы. */

	public static void main(String[] args) {
		int k = 2;
		int p = 3;
		int[][] mas = new int[5][5];

		init(mas, 20);
		printMas(mas);
		printLine(mas, k);
		printColumn(mas, p);
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

	public static void printLine(int[][] mas, int k) {
		int i;
		int j;

		i = k - 1;
		System.out.println(k + " строка: ");
		for (j = 0; j < mas[i].length; j++) {
			System.out.printf("%3d", mas[i][j]);
		}
		System.out.println();

	}

	public static void printColumn(int[][] mas, int p) {
		int i;
		int j;

		j = p - 1;
		System.out.println(p + " столбец: ");
		for (i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i][j]);
		}
	}
}
