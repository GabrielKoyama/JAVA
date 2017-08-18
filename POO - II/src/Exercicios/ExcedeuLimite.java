package Exercicios;

public class ExcedeuLimite {

	int numerodaconta;
	double saldoinicial, totaldositens, totaldecreditos,limitedecredito;
	
	public void novoSaldo(double saldonicial, double despesas, double credito){
		System.out.println(+numerodaconta);
		
		double calculodosaldo;
		calculodosaldo =  saldoinicial + despesas - credito;
		
		if(calculodosaldo > 0)
			System.out.printf("Novo saldo = %.2f\n!CREDITO EXCEDIDO!", calculodosaldo);
		else
			System.out.printf("Novo saldo = %.2f\nCREDITO NAO EXCEDIDO", calculodosaldo);
	}
	
	
}
