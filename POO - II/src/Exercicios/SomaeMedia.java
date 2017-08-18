package Exercicios;
import java.util.Scanner;

public class SomaeMedia {
	
	public void somaMedia(){
	int num1, num2,soma;
	double media;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero: ");
	num1 = leitor.nextInt();
	
	System.out.println("Digite o segundo numero: ");
	num2 = leitor.nextInt();
	
	soma = num1 + num2;
	media = ((double)(num1) + (double)(num2))/2;
	
	if (soma < media){
		System.out.println("A soma eh: "+soma);
		System.out.println("A media eh: "+media);
	}
	else{
		System.out.println("A soma eh: "+media);
		System.out.println("A media eh: "+soma);
	}
	leitor.close();
	
	}
	
}
