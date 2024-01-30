package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);

		Arroz ingrediente1 = new Arroz(0.20);
		Feijao ingrediente2 = new Feijao(0.10);
		Sorvete sobremesa = new Sorvete(0.40);

		// Comida ingrediente3 = new Comida(0.3);

		System.out.println(convidado.getPeso());

		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());

		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
	}
}
