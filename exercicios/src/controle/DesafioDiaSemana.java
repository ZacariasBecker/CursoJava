package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next().trim();

		if (dia.equals("domingo")) {
			System.out.printf("%s -> 1", dia);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.printf("%s -> 2", dia);
		} else if (dia.equalsIgnoreCase("terca")) {
			System.out.printf("%s -> 3", dia);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.printf("%s -> 4", dia);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.printf("%s -> 5", dia);
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.printf("%s -> 6", dia);
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.printf("%s -> 7", dia);
		} else {
			System.out.printf("%s como dia da semana nao existe!", dia);
		}
		entrada.close();
	}
}
