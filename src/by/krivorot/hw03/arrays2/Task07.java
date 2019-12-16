package by.krivorot.hw03.arrays2;

public class Task07 {
	/*
	 * Пусть даны две неубывающие последовательности действительных чисел a1 <= a2
	 * <= an и b1 <= b2 <= bm . Требуется указать те места, на которые нужно
	 * вставлять элементы последовательности b1 <= b2 <= bm в первую
	 * последовательность так, чтобы новая последовательность оставалась
	 * возрастающей.
	 */

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 18, 20, 25, 28, 29, 34, 39, 48, 57, 58 };
		int[] b = new int[] { 3, 5, 8, 10, 17, 22, 31, 36, 37, 40 };
		int[] insertionPoints;

		printMas(a);
		printMas(b);

		insertionPoints = findInsertionPoints(a, b);
		printMas(insertionPoints);

	}

	public static int[] findInsertionPoints(int[] a, int[] b) {
		int[] mas = new int[b.length];
		int i;
		int j = 0;

		for (i = 0; i < b.length; i++) {
			mas[j] = binSearch(a, b[i]);
			j++;
		}

		return mas;
	}

	public static int binSearch(int[] mas, int i) {
		int firstIndex = 0;
		int lastIndex = mas.length - 1;
		int middleIndex;

		if (i >= mas[lastIndex]) {
			return mas[lastIndex];
		} else {
			while (firstIndex < lastIndex) {
				middleIndex = (firstIndex + lastIndex) / 2;

				if (mas[middleIndex] > i) {
					lastIndex = middleIndex;
				} else {
					firstIndex = middleIndex + 1;
				}
			}
			return firstIndex;
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
