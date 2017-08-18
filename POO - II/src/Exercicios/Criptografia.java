package Exercicios;
import java.util.Scanner;

public class Criptografia {

	void demonio(){
	
	int senha;
	char[] separa;
		
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite os numeros a serem criptografados: ");
	 senha = leitor.nextInt();
	
	//Separar os numeros;                            !404!
	 
	 separa = String.valueOf(senha).toCharArray();
	 
	}
	
}

/*
 dados1 = senha/1000;
	dados2 = senha/100;
	dados3 = senha/10;
	dados4 = senha/1;
	
	System.out.println(+dados1);
	System.out.println(+dados2);
	System.out.println(+dados3);
	System.out.println(+dados4);
 */
