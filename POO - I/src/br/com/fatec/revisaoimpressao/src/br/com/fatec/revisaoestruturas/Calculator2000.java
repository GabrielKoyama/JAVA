package br.com.fatec.revisaoestruturas;
import java.util.Scanner;

public class Calculator2000 {
	public static void main(String[] args) {
		Scanner leitor = new java.util.Scanner(System.in);
		
		boolean executar = true;
		
		while (executar){
			System.out.println("Calculadora Basica. Para fazer c�lculos com apenas dois numeros");
			System.out.println("Digite a op��o que deseja fazer: ");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTTRA��O");
			System.out.println("3 - MULTIPLICA��O");
			System.out.println("4 - DIVIS�O");
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
