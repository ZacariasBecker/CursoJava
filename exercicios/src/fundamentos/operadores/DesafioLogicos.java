package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {

		boolean trabalho1 = true;
		boolean trabalho2 = false;

		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean saudavel = !sorvete;

		System.out.println("Comprou TV 50? " + tv50);
		System.out.println("Comprou TV 32? " + tv32);
		System.out.println("Comprou sorvete? " + sorvete);
		System.out.println("Mais saudavel? " + saudavel);
	}
}
