package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task37 {
	/* Переставить строки матрицы случайным образом. */

	public static void main(String[] args) {
		int[][] mas = new int[6][4];

		init(mas, 50);
		printMas(mas);

		changeLines(mas);
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

	public static void changeLines(int[][] mas) {
		int tmp;
		int i;
		int j;
		int[][] temp = new int[mas.length][mas[0].length];
		int[] indexes = new int[mas.length];

		initIndexes(indexes);
		Random rand = new Random();

		for (i = 0; i < indexes.length; i++) {
			do {
				tmp = rand.nextInt(indexes.length);
			} while (!isUnique(indexes, tmp));
			indexes[i] = tmp;
		}

		for (j = 0; j < mas.length; j++) {
			temp[j] = mas[indexes[j]];
		}

		for (j = 0; j < mas.length; j++) {
			mas[j] = temp[j];
		}
	}

	public static void initIndexes(int[] mas) {
		int i;

		for (i = 1; i < mas.length; i++) {
			mas[i] = -1;
		}
	}

	public static boolean isUnique(int[] mas, int x) {
		int i;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] == x) {
				return false;
			}
		}
		return true;
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
