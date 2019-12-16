package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task04 {
	/* Дана матрица. Вывести на экран первую и последнюю строки. */

	public static void main(String[] args) {
		int[][] mas = new int[8][7];

		init(mas, 20);
		printMas(mas);
		printFirstAndLastLine(mas);
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

	public static void printFirstAndLastLine(int[][] mas) {
		int i;
		int j;

		System.out.println();
		i = 0;
		for (j = 0; j < mas[i].length; j++) {
			System.out.printf("%3d", mas[i][j]);
		}
		System.out.println();
		i = mas.length - 1;
		for (j = 0; j < mas[i].length; j++) {
			System.out.printf("%3d", mas[i][j]);
		}

	}

}
