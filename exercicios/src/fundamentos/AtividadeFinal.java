package fundamentos;

import java.util.Scanner;

public class AtividadeFinal {

	static void um(Scanner entrada) {
		// 1) Criar um programa que leia a temperatura em Fahrenheit e converta para
		// Celsius.

		System.out.println("1 ===================");

		System.out.print("Digite uma temperatura em Fahrenheit: ");
		double f = entrada.nextDouble();
		double c = (f - 32) * (5.0 / 9.0);
		System.out.printf("%.2fF = %.2fC\n", f, c);

		System.out.println("=====================\n");
	}

	static void dois(Scanner entrada) {
		// Criar um programa que leia a temperatura em Celsius e converta para
		// Fahrenheit.

		System.out.println("2 ===================");

		System.out.print("Digite uma temperatura em Celcius: ");
		double c = entrada.nextDouble();
		double f = (c * (5.0 / 9.0)) + 32;
		System.out.printf("%.2fC = %.2fF\n", c, f);

		System.out.println("=====================\n");
	}

	static void tres(Scanner entrada) {
		// Criar um programa que leia o peso e a altura do usuário e imprima no console
		// o IMC.

		System.out.println("3 ===================");

		System.out.print("Digite o peso em quilos: ");
		double peso = entrada.nextDouble();
		System.out.print("Digite a altura em centimetros: ");
		double altura = entrada.nextDouble();

		double imc = peso / (Math.pow((altura / 100), 2));

		System.out.println("IMC:" + imc);

		System.out.println("=====================\n");

	}

	static void quatro(Scanner entrada) {
		// Criar um programa que leia um valor e apresente os resultados ao quadrado e
		// ao cubo do valor.

		System.out.println("4 ===================");

		System.out.print("Digite um double: ");
		double n = entrada.nextDouble();
		System.out.println("n * n: " + Math.pow(n, 2));
		System.out.println("n * n * n: " + Math.pow(n, 3));

		System.out.println("=====================\n");
	}

	static void cinco(Scanner entrada) {
		// Criar um programa que leia o valor da base e da altura de um triângulo e
		// calcule a área.

		System.out.println("5 ===================");

		System.out.print("Digite a altura do triangulo: ");
		double altura = entrada.nextDouble();
		System.out.print("Digite a base do triangulo: ");
		double base = entrada.nextDouble();

		double area = (base * altura) / 2;

		System.out.println("Area do triangulo: " + area);

		System.out.println("=====================\n");
	}

	static void seis(Scanner entrada) {
		// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		// utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
		// Encontre o delta

		System.out.println("6 ===================");
		System.out.println("Sendo: ax2 + bx + c = 0");
		System.out.print("Digite o valor de 'a': ");
		int a = entrada.nextInt();
		System.out.print("Digite o valor de 'b': ");
		int b = entrada.nextInt();
		System.out.print("Digite o valor de 'c': ");
		int c = entrada.nextInt();

		int delta = (b * b) - (4 * a * c);

		double x1 = (-b - Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b + Math.sqrt(delta)) / (2.0 * a);

		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		um(entrada);
		dois(entrada);
		tres(entrada);
		quatro(entrada);
		cinco(entrada);
		seis(entrada);

		entrada.close();
	}
}
