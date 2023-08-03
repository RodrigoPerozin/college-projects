package br.com.exercicio1;

public class Pessoa {
	private String nome;
	private int idade;
	private String email;
	
	public Pessoa(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}