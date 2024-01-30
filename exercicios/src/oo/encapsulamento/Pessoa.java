package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa() {
		this("___", 0);
	}

	public Pessoa(String nome, int idade) {
		setIdade(idade);
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}
	}

	@Override
	public String toString() {
		return getNome() + ": " + getIdade() + " anos.";
	}
}
