package Exercicio2;
import java.util.Scanner;

public class Estacionamento {
	
	private Scanner scanner = new Scanner(System.in);
	
	void taxaMinima(){
	
		double horaminima=2.00;
		double horas;
		
		System.out.println("Digite as horas usadas: ");
		horas = scanner.nextDouble();
		
		if(horas > 3.00){
			double tempoamais = horas - 3.00;
			double gastoamais = (0.50 * tempoamais) + 2.00;
			
			System.out.printf("Voce gastou %.0f horas a mais do que o minimo.\n", tempoamais);
			System.out.printf("Total: %.2f reais", gastoamais);
		}
		else{
			System.out.printf("Voce nao excedeu o limite de tempo.\n");
			System.out.println("Total: R$2.00.");
		}
	}
	
	
	
}
