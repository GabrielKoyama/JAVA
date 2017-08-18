package Exercicios;
import java.util.Scanner;

public class Multiplo {

	public void mult(){
		int num1, num2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leitor.nextInt();
		
		if(num1 % num2 == 0)
			System.out.println("Sao multiplos");
		else 
			System.out.println("Nao sao multiplos");
		
		leitor.close();
	}
}
