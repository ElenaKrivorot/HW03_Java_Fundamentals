package by.krivorot.hw03.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task27 {
	/*
	 * В числовой матрице поменять местами два любых столбца, т. е. все элементы
	 * одного столбца поставить на соответствующие им позиции другого, а элементы
	 * второго переместить в первый. Номера столбцов вводит пользователь с
	 * клавиатуры.
	 */

	public static void main(String[] args) {
		int n = 6;
		int m = 5;
		int[][] mas = new int[n][m];

		init(mas, 100);
		printMas(mas);
		int[] columns = enterColumnsToBeChanged();
		changeColumns(mas, columns);
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

	@SuppressWarnings("resource")
	public static int[] enterColumnsToBeChanged() {
		int n;
		int m;
		int[] mas = new int[2];

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер первого столбца: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введено некорректное число, повторите ввод ");
		}
		n = sc.nextInt();
		mas[0] = n;

		System.out.println("Введите номер второго столбца: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введено некорректное число, повторите ввод ");
		}
		m = sc.nextInt();
		mas[1] = m;

		return mas;
	}

	public static void changeColumns(int[][] mas, int[] columns) {
		int i;
		int tmp;
		int a = columns[0];
		int b = columns[1];

		for (i = 0; i < mas.length; i++) {
			tmp = mas[i][a];
			mas[i][a] = mas[i][b];
			mas[i][b] = tmp;
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
}
