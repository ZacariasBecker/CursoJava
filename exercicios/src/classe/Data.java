package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		// this.dia = 1;
		// this.mes = 1;
		// this.ano = 1970;
		this(1, 1, 1970); // construtor chama outro construtor
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
