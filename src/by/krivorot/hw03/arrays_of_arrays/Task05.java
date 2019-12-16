package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;

public class Task05 {
	/*
	 * Дана матрица. Вывести на экран все четные строки, то есть с четными номерами
	 */

	public static void main(String[] args) {
		int[][] mas = new int[8][7];

		init(mas, 20);
		printMas(mas);
		printEvenLines(mas);
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

	public static void printEvenLines(int[][] mas) {
		int i;
		int j;

		System.out.println();
		for (i = 2; i < mas.length; i = i + 2) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}

	}
}
