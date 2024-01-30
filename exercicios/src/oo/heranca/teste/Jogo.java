package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.printf("monstro: [%d, %d] - vida: %d%%\n", monstro.x, monstro.y, monstro.vida);
		System.out.printf("heroi: [%d, %d] - vida: %d%%\n", heroi.x, heroi.y, heroi.vida);
	}
}
