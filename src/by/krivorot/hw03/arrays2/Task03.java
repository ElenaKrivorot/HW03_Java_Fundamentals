package by.krivorot.hw03.arrays2;

public class Task03 {
	/*
	 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an
	 * .Требуется переставить элементы так, чтобы они были расположены по убыванию.
	 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
	 * ставится на первое место, а первый - на место наибольшего. Затем, начиная со
	 * второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
	 */
	public static void main(String[] args) {
		int[] mas = new int[] { 1, 2, 3, 4, 9, 9, 14, 18, 20 };

		printMas(mas);
		sortMas(mas);
		printMas(mas);

	}

	public static void sortMas(int[] mas) {
		int i;
		int max;
		int max_i;
		int j;
		int tmp;

		for (i = 0; i < mas.length; i++) {
			max = mas[i];
			max_i = i;
			for (j = i + 1; j < mas.length; j++) {
				if (mas[j] > max) {
					max = mas[j];
					max_i = j;
				}
			}
			if (i != max_i) {
				tmp = mas[i];
				mas[i] = mas[max_i];
				mas[max_i] = tmp;
			}
		}
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}
}
