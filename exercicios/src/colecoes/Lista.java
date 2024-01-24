package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println("Usuário 3: " + lista.get(3).nome); // acessa pelo index
		lista.remove(1); // remove pelo index
		System.out.println(lista.remove(new Usuario("Manu"))); // remove pelo Objeto
		System.out.println(lista.contains(new Usuario("Ana"))); // verifica se existe

		for (Usuario u : lista) {
			System.out.println(u.toString());
		}
	}
}
