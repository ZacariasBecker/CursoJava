package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {

		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();

		caixaA.guardar(1.1);
		caixaB.guardar(1);
	}
}
