package Exercicio2;

import java.util.Scanner;

public class PardeInteiros {

	private Scanner scanner = new Scanner(System.in);

	void multiplo() {

		int primeiro, segundo, flag = 1;
		boolean testa;

		
			System.out.println("Digite o primeiro numero: ");
			primeiro = scanner.nextInt();

			System.out.println("Digite o segundo numero: ");
			segundo = scanner.nextInt();

			if (segundo % primeiro == 0) {
				testa = true;
				System.out.println(testa);
			}
			else {
				testa = false;
				System.out.println(testa);
			}
		

	}
}
