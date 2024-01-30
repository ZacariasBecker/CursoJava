package oo.heranca;

public class Monstro extends Jogador {

	public Monstro() {
		this(0, 0);
	}

	public Monstro(int x, int y) {
		super(x, y);
	}

	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);

		if ((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {
			oponente.vida -= 15;
			return true;
		}

		return false;
	}
}
