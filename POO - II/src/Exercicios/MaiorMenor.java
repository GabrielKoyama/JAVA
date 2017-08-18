package Exercicios;
import java.util.Scanner;

public class MaiorMenor {
	
	public void maiorMenor(){
		int[] vetor = new int[5];
		int i,maior=0, menor=0;
		
		
		Scanner leitor = new Scanner(System.in);
		
		for(i=0; i<vetor.length; i++){
			System.out.printf("Digite o %d valor: \n", i+1);
			vetor[i] = leitor.nextInt();
		}
		
		maior = vetor[0];
		menor = vetor[0];
		
		for(i=0; i<vetor.length;i++){
			if(maior < vetor[i])
				maior = vetor[i];
			
			else if (menor > vetor[i])
				menor = vetor[i];
		}
		
		System.out.println("O maior numero eh: "+maior);
		System.out.println("O menor numero eh: "+menor);
		leitor.close();
	}
	
	
}
