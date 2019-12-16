package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task11 {
	/*
	 * Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
	 * строка справа налево, вторая строка слева направо, третья строка справа
	 * налево и так далее.
	 */

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		init(mas, 20);
		printMas(mas);
		print2Mas(mas);

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

	public static void print2Mas(int[][] mas) {
		int i;
		int j;

		System.out.println();
		for (i = 0; i < mas.length; i++) {
			if (i == 0 || i % 2 == 0) {
				for (j = 0; j < mas[i].length; j++) {
					System.out.printf("%3d", mas[i][j]);
				}
			} else {
				for (j = mas[i].length - 1; j >= 0; j--) {
					System.out.printf("%3d", mas[i][j]);
				}
			}
			System.out.println();
		}
	}
}
