package by.krivorot.hw03.arrays2;

import java.util.Random;

public class Task06 {
	/*
	 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
	 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
	 * элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются на один элемент
	 * вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один
	 * элемент назад. Составить алгоритм этой сортировки.
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];

		init(mas, 20);
		printMas(mas);
		sortMas(mas);
		printMas(mas);

	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static void sortMas(int[] mas) {
		int i;
		int j;
		int step;
		int tmp;

		for (step = mas.length / 2; step > 0; step = step / 2) {
			for (i = step; i < mas.length; i++) {
				tmp = mas[i];
				for (j = i; j >= step; j = j - step) {
					if (tmp < mas[j - step])
						mas[j] = mas[j - step];
					else
						break;
				}
				mas[j] = tmp;
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
