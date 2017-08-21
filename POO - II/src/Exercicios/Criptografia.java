package Exercicios;
import java.util.Scanner;

public class Criptografia {

	void criptografa(){
	
	int senha, senha1,senha2,senha3,senha4;
	char[] separa;
	
	 
			
	Scanner leitor = new Scanner(System.in);
	
	// ler
	System.out.println("Digite os numeros a serem criptografados: ");
	 senha = leitor.nextInt();
	
	//separa
	 senha1 = senha/1000;
	 senha2 = (senha%1000)/100;
	 senha3 = (senha%100)/10;
	 senha4 = senha%10;
	 
	 //criptografa
	 senha1 = (senha1 + 7)%10;
	 senha2 = (senha2 + 7)%10;
	 senha3 = (senha3 + 7)%10;
	 senha4 = (senha4 + 7)%10;
	 
	 //senha = senha3 + senha4 + senha1 + senha2;
	 
	 System.out.printf("%d%d%d%d",senha3, senha4, senha1, senha2);
	  
	}
