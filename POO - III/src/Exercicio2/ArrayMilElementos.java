package Exercicio2;

public class ArrayMilElementos {

	void primos() {
		int[] testaPrimo = new int[999];

		for (int i = 2; i < testaPrimo.length; i++) {
			testaPrimo[i] = i;
			if (testaPrimo[i] % 2 != 0) {
				System.out.println(testaPrimo[i]);
			}
		}
	}
}