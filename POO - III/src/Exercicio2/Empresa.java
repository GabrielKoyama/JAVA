package Exercicio2;
import java.util.Scanner;

public class Empresa {
	private Scanner scanner;
	
	void compraProduto(){
		
		scanner = new Scanner(System.in);
		
		double p1=1.00;
		double p2=2.98;
		double p3=9.98;
		double p4=4.49;
		double p5=6.87;
		
		int pr1=0,pr2=0,pr3=0,pr4=0,pr5=0;
		double qtd1=0.0,qtd2=0.0,qtd3=0.0,qtd4=0.0,qtd5=0.0;
		//double porcentagemP1,porcentagemP2,porcentagemP3,porcentagemP4,porcentagemP5;
		
		/*
		porcentagemP1 = total / p1;
		porcentagemP2 = total / p2;
		porcentagemP3 = total / p3;
		porcentagemP4 = total / p4;
		porcentagemP5 = total / p5;
		*/
		
		int opcao=0;
		int sair=0;
		
		while(sair == 0)
			switch(opcao){
				case 1:{
					System.out.println("Quantidade desejada: ");
					pr1 = scanner.nextInt();
					p1 *= pr1;
					
					System.out.printf("Parabens, voce adquiriu %d do P1!\nEscolha novamente\n\n", pr1);
					opcao = scanner.nextInt();
					pr1 += pr1;
					break;
				}
				case 2:{
					System.out.println("Quantidade desejada: ");
					pr2 = scanner.nextInt();
					
					p2*= pr2;
					
					System.out.printf("Parabens, voce adquiriu %d do P2!\nEscolha novamente\n\n", pr2);
					pr2 += pr2;
					opcao = scanner.nextInt();
					break;
				}
				case 3:{
					System.out.println("Quantidade desejada: ");
					pr3 = scanner.nextInt();
					
					p3 *= pr3;
					
					System.out.printf("Parabens, voce adquiriu %d do P3\nEscolha novamente\n\n!", pr3);
					pr3 += pr3;
					opcao = scanner.nextInt();
					break;
				}
				case 4:{
					System.out.println("Quantidade desejada: ");
					pr4 = scanner.nextInt();
					
					p4 *= pr4;
					
					System.out.printf("Parabens, voce adquiriu %d do P4!\nEscolha novamente\n\n", pr4);
					pr4 += pr4;
					opcao = scanner.nextInt();
					break;
				}
				case 5:{
					System.out.println("Quantidade desejada: ");
					pr5 = scanner.nextInt();
					
					p5 *= pr5;
					
					System.out.printf("Parabens, voce adquiriu %d do P5!\nEscolha novamente\n\n", pr5);
					pr5 += pr5;
					opcao = scanner.nextInt();
					break;
				}
				case 6:{
					System.out.printf("Voce adquiriu: %d produtos\n", pr1 + pr2 + pr3 + pr4 + pr5);
					
					if(pr1 > 0)
						System.out.printf("Valor total: %.2f\n",p1);
					else if(pr2 > 0)
						System.out.printf("Valor total: %.2f\n",p2);
					else if(pr3 > 0)
						System.out.printf("Valor total: %.2f\n",p3);
					else if(pr4 > 0)
						System.out.printf("Valor total: %.2f\n",p4);
					else if(pr5 > 0)
						System.out.printf("Valor total: %.2f\n",p5);
					
					/*
					System.out.println("Porcentagem por produto: "+ 
					"P1 = " +porcentagemP1+
					"P2 = " +porcentagemP2+
					"P3 = " +porcentagemP3+
					"P4 = " +porcentagemP4+
					"P5 = " +porcentagemP5);
					*/
					
					System.out.println("Obrigado e volte sempre!");
					sair=1;
					break;
				}
				default:{
					imprimeOpcoes();
					opcao = scanner.nextInt();
					break;
				}
		
		}
	}
	
	void imprimeOpcoes(){
		System.out.println("Qual produto deseja comprar?");
		System.out.println();
		System.out.println("(1)P1 - R$1.00\n(2)P2 - R$2.98\n(3)P3 - R$9.98\n(4)P4 - R$4.49\n(5)P5 - R$6.87\n(6)Sair\nDigite o numero da opcao.");
		
	}
	
	
}
