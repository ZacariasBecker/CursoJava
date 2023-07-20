package fundamentos;

public class Inferencia {
	public static void main(String[] args) {

		double a = 4.5; // declaração e inicialização
		System.out.println(a);

		a = 12;
		System.out.println(a);

		// a = "...";

		var b = 4.5;
		System.out.println(b);

		var c = "TEXTO";
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);

		// c = 4.5;

		double d; // declaração
		d = 123.56; // inicialização
		System.out.println(d); // usada

		/**
		 * var e; e = 44.55;(não é possível) var e =44.55; (é possível)
		 */
	}
}
