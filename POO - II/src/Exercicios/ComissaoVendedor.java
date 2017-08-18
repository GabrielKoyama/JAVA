package Exercicios;

public class ComissaoVendedor {
	
	public void calcularComissao(int itensvendidos){
		
		int calculo, aumento;
		
		aumento = (9 * itensvendidos)/100;
		calculo = aumento + 200;
		
		
		System.out.printf("Voce obteve %d de itens vendidos\n", itensvendidos);
		System.out.println("Sua comissao eh 9% de " +itensvendidos + " : " +aumento);
		System.out.printf("Seu salario eh %d\n", calculo);
		
	}
}
