package by.krivorot.hw03.arrays_of_arrays;

public class Task23 {
	/*
	 * Сформировать квадратную матрицу порядка N по правилу: a[i,j] =
	 * sin((i^2-j^2)/n) и подсчитать количество положительных элементов в ней.
	 */

	public static void main(String[] args) {
		int n = 6;
		double[][] mas = new double[n][n];

		init(mas);
		printMas(mas);
		print(countPositiveElements(mas));
	}

	public static void init(double[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((double) (i * i - j * j) / mas.length);
			}
		}

	}

	public static int countPositiveElements(double[][] mas) {
		int i;
		int j;
		int count = 0;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void printMas(double[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("%7.2f", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void print(int value) {
		System.out.println("Количество положительных элементов равно " + value);
	}
}
