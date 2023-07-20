package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salario do primeiro funcionario: ");
		String s1 = entrada.next().replace(",", ".");

		System.out.print("Digite o salario do segundo funcionario: ");
		String s2 = entrada.next().replace(",", ".");

		System.out.print("Digite o salario do terceiro funcionario: ");
		String s3 = entrada.next().replace(",", ".");

		double media = (Double.parseDouble(s1) + Double.parseDouble(s2) + Double.parseDouble(s3)) / 3;

		System.out.printf("%nMedia salarial: %.2f%n", media);

		entrada.close();

	}
}
