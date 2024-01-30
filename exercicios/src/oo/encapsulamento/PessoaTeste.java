package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setIdade(-30);

		Pessoa p2 = new Pessoa("Pedro", 33);

		System.out.println(p1);
		System.out.println(p2);
	}
}
