package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		};

		calc = (x, y) -> x * y;

		System.out.println(calc.executar(2, 3));
		System.out.println(calc.executar(2, 3));

		System.out.println(calc.naoImpede1());
		System.out.println(Calculo.naoImpede2());
	}
}
