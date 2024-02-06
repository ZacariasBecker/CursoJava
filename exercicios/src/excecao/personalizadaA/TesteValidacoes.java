package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("Ana", -7);
			Validar.Aluno(aluno);
		} catch (StringVaziaException e) {
			e.printStackTrace();
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}

//		try {
//			Aluno aluno = new Aluno("Ana", -7);
//			Validar.Aluno(aluno);
//		} catch (StringVaziaException | NumeroForaIntervaloException e) {
//			e.printStackTrace();
//		}

		System.out.println("FIM!");
	}
}
