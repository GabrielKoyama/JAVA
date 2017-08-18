package Exercicios;
import java.util.Scanner;


public class OperacoesNumericas {
	
	public void superCalculator2000(){
		int num1, num2;
		Scanner leitor = new java.util.Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leitor.nextInt();
		
		int soma, subt, prod;
		double div;
		
		soma = num1 + num2;
		subt = num1 - num2;
		div = (double)(num1) / (double)(num2);
		prod = num1 * num2;
		
		
		System.out.println("A soma dos numeros sao: " +soma );
		System.out.println("A subtração dos numeros sao: " +subt );
		System.out.printf("A divisao dos numeros sao: %.2f\n", div );
		System.out.println("O produto dos numeros sao: " +prod );		
	
		leitor.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
