package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações dos funcionário

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 567;
		int id = 34343;
		long pontosAcumulados = 3_123_321_123L;

		// Tipos Reais
		float salario = 12_321.44F;
		double vendasAcumuladas = 1_222_333.44;

		// Tipo Booleano
		boolean estaDeFerias = false; // true

		// tipo caractere
		char status = 'A'; // ativo

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// Búmero de viagens
		System.out.println(numerosDeVoos / 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
