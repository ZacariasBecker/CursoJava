package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);

	default String naoImpede1() {
		return "um";
	}

	static String naoImpede2() {
		return "dois";
	}
}
