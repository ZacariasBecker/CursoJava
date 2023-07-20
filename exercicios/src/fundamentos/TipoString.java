package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		System.out.println("Nome:" + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario);

		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.\n", nome, sobrenome, idade, salario);

		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.\n", nome, sobrenome, idade, salario);
		System.out.println(frase);

		System.out.println("abcdefghijklmnopqrstuvxyz");
		System.out.println("abcdefghijklmnopqrstuvxyz".indexOf("p"));
		System.out.println("abcdefghijklmnopqrstuvxyz".indexOf("pqr"));
		System.out.println("abcdefghijklmnopqrstuvxyz".indexOf("eee"));
		System.out.println("abcdefghijklmnopqrstuvxyz".substring(6));
		System.out.println("abcdefghijklmnopqrstuvxyz".substring(6, 10));
	}
}
