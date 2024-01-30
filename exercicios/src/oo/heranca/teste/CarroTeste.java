package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Civic(200);
		Carro c2 = new Ferrari(400);
		Ferrari c3 = new Ferrari(400);

		c3.ligarTurbo();
		c3.desligarAr();

		c1.acelerar();
		c2.acelerar();
		c3.acelerar();
		System.out.println(c1 + " " + c2 + " " + c3);
		c1.acelerar();
		c2.acelerar();
		c3.acelerar();
		System.out.println(c1 + " " + c2 + " " + c3);
		c1.acelerar();
		c2.acelerar();
		c3.acelerar();
		System.out.println(c1 + " " + c2 + " " + c3);
	}
}
