package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		for (Integer num : nums) {
			System.out.println(num);
		}

		System.out.println();
		
		SortedSet<String> listaAprovadosEmOrdem = new TreeSet<>();
		listaAprovadosEmOrdem.add("CAP");
		listaAprovadosEmOrdem.add("Adr");
		listaAprovadosEmOrdem.add("IBM");
		listaAprovadosEmOrdem.add("Zac");
		for (String candidato : listaAprovadosEmOrdem) {
			System.out.println(candidato);
		}

	}
}
