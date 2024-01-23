package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 11;
		d1.mes = 11;
		d1.ano = 2023;

		Data d2 = new Data(24, 12, 2023);

		Data d3 = new Data();

		System.out.println(d1.obterDataFormatada());
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();
	}
}
