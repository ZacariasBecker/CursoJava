package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C

		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fah = 86;
		double cel = (fah - AJUSTE) * FATOR;
		System.out.println("O resultado eh " + cel + "C.");

		fah = 0;
		cel = (fah - AJUSTE) * FATOR;
		System.out.println("O resultado eh " + cel + "C.");
	}
}
