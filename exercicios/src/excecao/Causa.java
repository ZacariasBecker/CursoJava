package excecao;

public class Causa {
	public static void main(String[] args) {
		try {
			MetodoA(null);
		} catch (NullPointerException e) {
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}

	static void MetodoA(Aluno aluno) {
		try {
			MetodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}

	static void MetodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está NULO");
		}
		System.out.println(aluno.nome);
	}
}
