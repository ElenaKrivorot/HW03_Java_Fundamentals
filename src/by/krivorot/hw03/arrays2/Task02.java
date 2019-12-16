package by.krivorot.hw03.arrays2;

public class Task02 {
	/*
	 * Даны две последовательности a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm .
	 * Образовать из них новую последовательность чисел так, чтобы она тоже была
	 * неубывающей. Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {
		int[] mas = new int[] { 1, 2, 3, 4, 9, 9, 14, 18, 20 };
		int[] mas2 = new int[] { 2, 4, 6, 8, 10, 12, 16 };
		int[] mas3;

		mas3 = createNewMas(mas, mas2);
		printMas(mas);
		printMas(mas2);
		printMas(mas3);

	}

	public static int[] createNewMas(int[] mas, int[] mas2) {
		int i;
		int j = 0;
		int k = 0;
		int[] mas3 = new int[mas.length + mas2.length];

		for (i = 0; i < mas3.length; i++) {
			if (j < mas.length && k < mas2.length) {
				if (mas[j] <= mas2[k]) {
					mas3[i] = mas[j];
					j++;
				} else {
					mas3[i] = mas2[k];
					k++;
				}
			} else {
				if (j == mas.length) {
					mas3[i] = mas2[k];
					k++;
				}
				if (k == mas2.length) {
					mas3[i] = mas[j];
					j++;
				}
			}
		}
		return mas3;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

}
