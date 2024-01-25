package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Civic();
		Carro c2 = new Ferrari();

		c1.acelerar();
		c2.acelerar();
		System.out.println(c1 + " " + c2);
		c1.acelerar();
		c2.acelerar();
		System.out.println(c1 + " " + c2);
		c1.acelerar();
		c2.acelerar();
		System.out.println(c1 + " " + c2);
	}
}
