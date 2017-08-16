package br.com.fatec.revisaoestruturas;
import java.util.Scanner;

public class Calculator2000 {
	public static void main(String[] args) {
		Scanner leitor = new java.util.Scanner(System.in);
		
		boolean executar = true;
		
		while (executar){
			System.out.println("Calculadora Basica. Para fazer cálculos com apenas dois numeros");
			System.out.println("Digite a opção que deseja fazer: ");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTTRAÇÃO");
			System.out.println("3 - MULTIPLICAÇÃO");
			System.out.println("4 - DIVISÃO");
			System.out.println("5 - SAIR");
			
			int opcao = leitor.nextInt();
			
			if (opcao == 1){
				System.out.println("Digite o numero: ");
				int num1 = leitor.nextInt();
				
				System.out.println("Digite o segundo numero: ");
				int num2 = leitor.nextInt();
				
				System.out.printf("Resultado: %d\n", num1 + num2 );
			}
			
			else if (opcao == 2) {
				System.out.println("Digite o numero: ");
				int num1 = leitor.nextInt();
				
				System.out.println("Digite o segundo numero: ");
				int num2 = leitor.nextInt();
				
				System.out.printf("Resultado: %d\n", num1 - num2 );
			}
			
			else if (opcao == 3) {
				System.out.println("Digite o numero: ");
				int num1 = leitor.nextInt();
				
				System.out.println("Digite o segundo numero: ");
				int num2 = leitor.nextInt();
				
				System.out.printf("Resultado: %d\n", num1 * num2 );
			}
			
			else if (opcao == 4) {
				System.out.println("Digite o numero: ");
				int num1 = leitor.nextInt();
				
				System.out.println("Digite o segundo numero: ");
				int num2 = leitor.nextInt();
				
				System.out.printf("Resultado: %d\n", num1 / num2 );
			}
			
			else if (opcao == 5) {
			executar = false;
			}
		
		}
		
		leitor.close();
	}
}
