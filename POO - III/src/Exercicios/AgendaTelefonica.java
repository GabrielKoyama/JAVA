package Exercicios;

import java.util.Scanner;

public class AgendaTelefonica extends Pessoa {
	private Pessoa[] pessoas;
	private Scanner scanner;

	public AgendaTelefonica() {
		pessoas = new Pessoa[5];
		scanner = new Scanner(System.in);
	}

	public void cadastrarPessoa() {

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] == null) {
				System.out.println("\nInsira um nome: ");
				String nome = scanner.next();

				System.out.println("\nInsira um telefone: ");
				String telefone = scanner.next();

				System.out.println("\nInsira um email: ");
				String email = scanner.next();

				Pessoa nova = new Pessoa(nome,telefone,email);
				pessoas[i] = nova;

				System.out.println("\nNovo contato adicionado!");
				break;

			}
		}
	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opcoes: \n");
		System.out.println("1 - Listar contatos. \n");
		System.out.println("2 - Incluir dados. \n");
		System.out.println("3 - Sair. \n");
	}

	public void imprimirPessoas() {
		for (Pessoa pessoa : pessoas) {
			if (pessoa != null) {
				System.out.println("\nNome: "+pessoa.getNome()+"\nTelefone: "
						+pessoa.getTelefone()+ "\nEmail: "+pessoa.getEmail());
			}
		}
	}
	
	public Pessoa[] getPessoas(){
		return pessoas;
	}
	
	
	public void setPessoas(Pessoa[] pessoas){
		this.pessoas = pessoas;
		
	}
	

}
