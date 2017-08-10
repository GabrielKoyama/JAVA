/*
Exercicios

1 � Criar um m�todo que calcula a sequ�ncia de Fibonacci de forma recursiva, ou seja, n�o pode usar estrutura de repeti��o.

2 � Criar um m�todo que calcula a pot�ncia de forma recursiva, ou seja, n�o pode usar estrutura de repeti��o.

3 � Criar um m�todo que calcula o somat�rio dos elementos de um array de forma recursiva, ou seja, n�o pode usar
estrutura de repeti��o.

4 � Criar um m�todo que obt�m o maior valor de um array de forma recursiva, ou seja, n�o pode usar estrutura de repeti��o.

*/


package aula;

public class Principal {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
		
		System.out.println(potencia(2,3));
		
		int v[] = {10,20,30,40};
		System.out.println(soma(1));
		
		
	}
	
	private static long fatorial(int n) {
		if (n <= 1)
			return 1;
		else 
			return n * fatorial(n-1);
		
	}
	
	public static long potencia(int b, int e) {
		if (e == 1)
			return b;
		else if (e < 1)
			return 1;
		else
			return b * potencia(b, e-1);
	}
	
	public static int soma(int i) {
		return 1;
		}
	
	public static int maiorValor(){
		return 1;
	}
	
	
	}


