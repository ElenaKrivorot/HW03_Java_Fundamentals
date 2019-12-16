package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class task09 {
	/* Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. */

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		init(mas, 20);
		printMas(mas);
		printDiagonalElements(mas);
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

	public static void printDiagonalElements(int[][] mas) {
		int i;
		int j;

		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.printf("%3d", mas[i][j]);
				}
			}
		}
	}
}
