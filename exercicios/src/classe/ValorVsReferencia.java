package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor
		a++;
		b--;
		System.out.printf("%f\n%f\n", a, b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência
		d1.dia = 31;
		d2.dia = 12;
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();

		voltarDataParaValorPadrao(d1);

		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}
}
