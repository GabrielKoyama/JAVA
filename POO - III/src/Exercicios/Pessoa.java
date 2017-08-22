package Exercicios;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	
	
	//Perguntar pq q se eu colocar void aq da erro na classe AgendaTelefonica
	public Pessoa (String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	//praq serve essa classe?
	public Pessoa(){}
	
	public String getNome(){
		return nome;
	}	
	
	//Pq tem esses set?
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
}