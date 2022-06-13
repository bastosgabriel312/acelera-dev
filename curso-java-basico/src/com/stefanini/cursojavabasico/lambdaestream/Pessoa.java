package com.stefanini.cursojavabasico.lambdaestream;

public class Pessoa {
	private int idade;
	private String nome;
	
	Pessoa(String nome,int idade){
		this.nome = nome;
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
