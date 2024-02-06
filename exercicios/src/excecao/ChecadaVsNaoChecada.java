package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		try {
			geraErro2();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Fim");
	}

	// Exceção não checada ou verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #1");
	}

	// Exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #2");
	}
}
