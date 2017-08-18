package Exercicios;

public class SalarioEmpregado {

	public void salario(int horastrabalhadas){
		
		System.out.println("supondo que a empresa paga 100 reais como hora normal:");
		System.out.printf("\n\n\n");
		
		int valorhoranormal = 100; 
		int calculo = horastrabalhadas - 40;
		int antigosalario = valorhoranormal * horastrabalhadas;
		int novosalario = ((50 * 100)/100) * (calculo) + antigosalario;
		
		System.out.println("Horas trabalhadas: " + horastrabalhadas);
		System.out.println("Novo salario: " +novosalario);
		System.out.println("Salario que iria ganhar sem os 50% d por hora extra: " +antigosalario);
		
	}
	
}

/*
	trabalhou = 50horas 
	10 horas sao extra, portanto, ele vai ganhar 400 = (100r * 40h) + (150r * 10h)
	==> 4000 + 1500
	==> era p ele ter ganhado 1000 nas outras 10h

*/