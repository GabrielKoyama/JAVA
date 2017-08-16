package br.com.fatec.revisaoestruturas;

public class RevisaoIfElse {

	public static void main(String[] args) {
		java.util.Scanner leitor = new java.util.Scanner (System.in);
		int num1 = 0;
		int num2 = 0;
		boolean flag = true;
		String aux = null;
		
		
		while(flag){
			
		
		System.out.println("Insira um valor inteiro para o numero 1: ");
		num1 = leitor.nextInt();
		
		System.out.println("Insira um valor inteiro para o numero 2: ");
		num2 = leitor.nextInt();
		
		if(num1 > num2)
			{System.out.println("Numero 1 eh maior que o numero 2");}
		
		else if (num1 < num2)
			{System.out.println("Numweo 1 eh menor que o numero 1");}
		
		else if (num1 == num2) 
			{System.out.println("São iguais");}
		
		else if (num1 != num2)
			{System.out.println("Numero 1 eh diferente que o numero 2");}
		
		System.out.println("Deseja encerrar?(S/N): ");
			aux = leitor.nextLine(); //perguntar p prof
		
		if ((aux == "S") || (aux == "s")){
			flag = true;
		}
		
		else if ((aux == "N") || (aux == "n")) {
			flag = false;
		}
		
		}
		
		System.out.println("Obrigado! :)");
		
		leitor.close();
			
	}

}
